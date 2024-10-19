package com.suziru.acgshop.server.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suziru.acgshop.common.result.Result;
import com.suziru.acgshop.pojo.entity.Product;
import com.suziru.acgshop.server.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品controller
 *
 */
@RestController
@RequestMapping("/admin/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    /**
     * 查询轮播图片
     */
/*    @GetMapping("/findSwiper")
    public Result findSwiper(){
       List<Product> swiperProductList = productService.list(new QueryWrapper<Product>().eq("isSwiper", "true").orderByAsc("swiperSort"));

        return Result.success(swiperProductList);
    }*/
    /**
     * 查询热门推荐商品
     * @return
     */
   /* @GetMapping("/findHot")
    public Result findHot(){
        Page<Product> page=new Page<>(0,8);
        Page<Product> pageProduct = productService.page(page,new QueryWrapper<Product>().eq("isHot", "true").orderByAsc("hotDateTime"));
        List<Product> hotProductList = pageProduct.getRecords();
        return Result.success(hotProductList);
    }*/
}
