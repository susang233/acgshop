package com.suziru.acgshop.server.controller.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suziru.acgshop.common.result.Result;
import com.suziru.acgshop.pojo.entity.Product;
import com.suziru.acgshop.pojo.entity.ProductIntroImage;
import com.suziru.acgshop.pojo.entity.ProductParaImage;
import com.suziru.acgshop.pojo.entity.ProductSwiperImage;
import com.suziru.acgshop.server.service.IProductIntroImageService;
import com.suziru.acgshop.server.service.IProductParaImageService;
import com.suziru.acgshop.server.service.IProductService;
import com.suziru.acgshop.server.service.IProductSwiperImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品controller
 *
 */
@RestController("userProductController")
@RequestMapping("/user/product")
public class ProductController {

    @Autowired
    private IProductService productService;
    @Autowired
    IProductSwiperImageService productSwiperImageService;
    @Autowired
    IProductIntroImageService productIntroImageService;
    @Autowired
    IProductParaImageService productParaImageService;

    /**
     * 查询轮播图片
     */
    @GetMapping("/findSwiper")
    public Result findSwiper(){
        List<Product> swiperProductList = productService.list(new QueryWrapper<Product>()
                .eq("isSwiper", true)
                .orderByAsc("swiperSort"));

        return Result.success(swiperProductList);
    }
    /**
     * 查询热门推荐商品
     * @return
     */
    @GetMapping("/findHot")
    public Result findHot(){
        Page<Product> page = new Page<>(0, 8);
        Page<Product> pageProduct = productService.page(page, new QueryWrapper<Product>()
                .eq("isHot", true)
                .orderByDesc("hotDateTime"));
        List<Product> hotProductList = pageProduct.getRecords();
        return Result.success(hotProductList);

    }
    @GetMapping("/detail/{id}")
    public Result detail(@PathVariable Long id){
        Product product = productService.getById(id);
        List<ProductSwiperImage> productSwiperImageList = productSwiperImageService.list(new QueryWrapper<ProductSwiperImage>().eq("productId", product.getId()).orderByAsc("sort"));
        List<ProductIntroImage> productIntroImageList = productIntroImageService.list(new QueryWrapper<ProductIntroImage>().eq("productId", product.getId()).orderByAsc("sort"));
        List<ProductParaImage> productParaImageList = productParaImageService.list(new QueryWrapper<ProductParaImage>().eq("productId", product.getId()).orderByAsc("sort"));
        product.setProductSwiperImageList(productSwiperImageList);
        product.setProductIntroImageList( productIntroImageList);
        product.setProductParaImageList(productParaImageList);

        return Result.success(product);
    }

    /**
     * 商品搜索
     * @param q
     * @return
     */
    @GetMapping("/search")
    public Result search(String q){
        List<Product> producetList = productService.list(new QueryWrapper<Product>().like("name", q));

        return Result.success(producetList);
    }
}
