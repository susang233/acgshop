package com.suziru.acgshop.pojo.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;

/**
 * 微信用户信息实体
 */
@TableName("t_wxUserInfo")
@Data
public class WxUserInfo implements Serializable {

    private Integer id; // 用户编号

    private String openid; // 用户唯一标识

    private String nickName; // 用户昵称

    private String avatarUrl; // 用户头像图片的 URL

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date registerDate; // 注册日期

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginDate; // 最后登录日期

    @TableField(select = false,exist = false)
    private String code; // 微信用户code 前端传来的


}