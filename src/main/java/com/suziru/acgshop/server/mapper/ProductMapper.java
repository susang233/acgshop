package com.suziru.acgshop.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suziru.acgshop.pojo.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper extends BaseMapper<Product> {


}
