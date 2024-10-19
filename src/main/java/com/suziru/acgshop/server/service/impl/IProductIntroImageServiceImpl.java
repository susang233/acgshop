package com.suziru.acgshop.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suziru.acgshop.pojo.entity.ProductIntroImage;
import com.suziru.acgshop.server.mapper.ProductIntroImageMapper;
import com.suziru.acgshop.server.service.IProductIntroImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 产品介绍Service实现类
 */
@Service("productIntroImageService")
public class IProductIntroImageServiceImpl extends ServiceImpl<ProductIntroImageMapper, ProductIntroImage> implements IProductIntroImageService {
    @Autowired
    private ProductIntroImageMapper productIntroImageMapper;



}
