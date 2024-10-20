package com.suziru.acgshop.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@TableName("t_product")
@Data
public class Product implements Serializable {

    private Integer id;
    private String name;
    private BigDecimal price;

    private Integer stock;
    private String proPic="default.jpg";
    private boolean isHot=false;
    private boolean isSwiper=false;
    private  Integer swiperSort=0;
    private String swiperPic="default.jpg";
    private String description;//描述

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Data hotDateTime;

    @TableField(select = false)
    private List<ProductSwiperImage> productSwiperImageList;
    @TableField(select = false)
    private List<ProductIntroImage> productIntroImageList;
    @TableField(select = false)
    private List<ProductParaImage> productParaImageList;

}
