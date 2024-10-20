package com.suziru.acgshop.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suziru.acgshop.pojo.entity.WxUserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 微信用户Mapper接口
 */
@Mapper
public interface WxUserInfoMapper extends BaseMapper<WxUserInfo> {

    /**
     * 根据openId查询用户信息
     * @param openid
     * @return
     */
    public WxUserInfo findByOpenId(String openid);

}
