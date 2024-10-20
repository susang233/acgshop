package com.suziru.acgshop.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 产品介绍图片
 */
@TableName("t_product_intro_image")
@Data
public class ProductIntroImage {
    @TableId(type = IdType.AUTO)
    private Integer id; // 编号

    private String image; // 图片名称

    private Integer sort; // 排列序号 从小到大排序

    private Integer productId; // 所属产品


}