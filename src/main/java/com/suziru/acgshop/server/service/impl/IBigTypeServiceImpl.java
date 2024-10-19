package com.suziru.acgshop.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suziru.acgshop.pojo.entity.BigType;
import com.suziru.acgshop.server.mapper.BigTypeMapper;

import com.suziru.acgshop.server.service.IBigTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品大类Service实现类
 */
@Service("bigTypeService")
public class IBigTypeServiceImpl extends ServiceImpl<BigTypeMapper, BigType> implements IBigTypeService {
    @Autowired
    private BigTypeMapper bigTypeMapper;

}
