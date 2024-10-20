package com.suziru.acgshop.server.controller.user;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suziru.acgshop.common.constant.SystemConstant;
import com.suziru.acgshop.common.properties.WeixinProperties;
import com.suziru.acgshop.common.result.Result;
import com.suziru.acgshop.common.util.HttpClientUtil;
import com.suziru.acgshop.common.util.JwtUtils;
import com.suziru.acgshop.pojo.entity.WxUserInfo;
import com.suziru.acgshop.server.service.IWxUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private WeixinProperties weixinProperties;

    @Autowired
    private HttpClientUtil httpClientUtil;

    @Autowired
    private IWxUserInfoService wxUserInfoService;

    /**
     * 微信登录
     * @return
     */
    @PostMapping("/wxlogin")
    public Result wxLogin(@RequestBody WxUserInfo wxUserInfo){
        System.out.println(weixinProperties);
        System.out.println("code="+wxUserInfo.getCode());
        String jscode2sessionUrl=weixinProperties.getJscode2sessionUrl()+"?appid="+weixinProperties.getAppid()+"&secret="+weixinProperties.getSecret()+"&js_code="+wxUserInfo.getCode()+"&grant_type=authorization_code";
        System.out.println(jscode2sessionUrl);
        String result = httpClientUtil.sendHttpGet(jscode2sessionUrl); // 带code请求获取openId
        System.out.println(result);
        JSONObject jsonObject = JSON.parseObject(result);
        String openid = jsonObject.get("openid").toString(); // 获取openId
        WxUserInfo resultUserInfo = wxUserInfoService.getOne(new QueryWrapper<WxUserInfo>().eq("openid", openid));
        if(resultUserInfo==null){ // 不存在 插入用户
            wxUserInfo.setOpenid(openid);
            wxUserInfo.setRegisterDate(new Date());
            wxUserInfo.setLastLoginDate(new Date());
            wxUserInfoService.save(wxUserInfo);
            System.out.println(wxUserInfo.getId());
        }else{  // 存在 更新用户信息
            System.out.println("存在");
            resultUserInfo.setNickName(wxUserInfo.getNickName());
            resultUserInfo.setAvatarUrl(wxUserInfo.getAvatarUrl());
            resultUserInfo.setLastLoginDate(new Date());
            wxUserInfoService.updateById(resultUserInfo);
            wxUserInfo.setId(resultUserInfo.getId());
        }
        //把token返回给客户端
        String token = JwtUtils.createJWT(openid, wxUserInfo.getNickName(), SystemConstant.JWT_TTL);
        Map<String,Object> resultMap=new HashMap<String,Object>();
        resultMap.put("token",token);
        return Result.success(resultMap);

    }

}
