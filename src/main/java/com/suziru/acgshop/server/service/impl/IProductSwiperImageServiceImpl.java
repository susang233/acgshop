package com.suziru.acgshop.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suziru.acgshop.pojo.entity.ProductSwiperImage;
import com.suziru.acgshop.server.mapper.ProductSwiperImageMapper;

import com.suziru.acgshop.server.service.IProductSwiperImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 产品轮播Service实现类
 */
@Service("productSwiperImageService")
public class IProductSwiperImageServiceImpl extends ServiceImpl<ProductSwiperImageMapper, ProductSwiperImage> implements IProductSwiperImageService {
    @Autowired
    private ProductSwiperImageMapper productSwiperImageMapper;



}
