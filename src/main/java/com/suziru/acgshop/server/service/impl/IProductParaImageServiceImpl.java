package com.suziru.acgshop.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suziru.acgshop.pojo.entity.ProductParaImage;
import com.suziru.acgshop.server.mapper.ProductParaImageMapper;
import com.suziru.acgshop.server.service.IProductParaImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 产品介绍Service实现类
 */
@Service("productParaImageService")
public class IProductParaImageServiceImpl extends ServiceImpl<ProductParaImageMapper, ProductParaImage> implements IProductParaImageService {
    @Autowired
    private ProductParaImageMapper productParaImageMapper;



}
