package com.suziru.acgshop.server.controller.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suziru.acgshop.common.result.Result;
import com.suziru.acgshop.pojo.entity.BigType;
import com.suziru.acgshop.pojo.entity.Product;
import com.suziru.acgshop.pojo.entity.SmallType;
import com.suziru.acgshop.server.service.IBigTypeService;
import com.suziru.acgshop.server.service.IProductService;
import com.suziru.acgshop.server.service.ISmallTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户商品大类controller
 *
 */
@RestController("userBigTypeController")
@RequestMapping("/user/bigType")
public class BigTypeController {

    @Autowired
    private IBigTypeService bigTypeService;
    @Autowired
    private ISmallTypeService smallTypeService;

    @Autowired
    private IProductService productService;

    /**
     * 查询轮播图片
     */
    @GetMapping("/findAll")
    public Result findSwiper(){
        List<BigType> bigTypeList = bigTypeService.list();


        return Result.success(bigTypeList);
    }
    @GetMapping("/findCategories")
    public Result findCategories(){
        List<BigType> bigTypeList = bigTypeService.list(new QueryWrapper<BigType>().orderByAsc("id"));
        for(BigType bigType:bigTypeList){
            List<SmallType> smallTypeList = smallTypeService.list(new QueryWrapper<SmallType>().eq("bigTypeId", bigType.getId()));
            bigType.setSmallTypeList(smallTypeList);
            for(SmallType smallType:smallTypeList){
                List<Product> productList = productService.list(new QueryWrapper<Product>().eq("typeId", smallType.getId()));
                smallType.setProductList(productList);
            }
        }
        return Result.success(bigTypeList);
    }
}
