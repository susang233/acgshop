package com.suziru.acgshop.server.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.suziru.acgshop.common.properties.WeixinProperties;
import com.suziru.acgshop.pojo.entity.WxUserInfo;
import com.suziru.acgshop.server.mapper.WxUserInfoMapper;
import com.suziru.acgshop.server.service.IWxUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


/**
 * 微信用户信息Service实现类

 */
@Service("wxUserInfoService")
public class IWxUserInfoServiceImpl extends ServiceImpl<WxUserInfoMapper, WxUserInfo> implements IWxUserInfoService {

    //微信服务接口地址

    @Autowired
    private WxUserInfoMapper wxUserInfoMapper;

}
