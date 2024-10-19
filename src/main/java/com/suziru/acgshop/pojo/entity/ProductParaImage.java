package com.suziru.acgshop.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 产品规格图片
 */
@TableName("t_product_para_image")
@Data
public class ProductParaImage {

    private Integer id; // 编号

    private String image; // 图片名称

    private Integer sort; // 排列序号 从小到大排序

    private Integer productId; // 所属产品


}