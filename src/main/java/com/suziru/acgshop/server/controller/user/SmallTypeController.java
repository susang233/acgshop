package com.suziru.acgshop.server.controller.user;

import com.suziru.acgshop.common.result.Result;
import com.suziru.acgshop.pojo.entity.SmallType;
import com.suziru.acgshop.server.service.ISmallTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品小类controller
 *
 */
@RestController("userSmallTypeController")
@RequestMapping("/user/smallType")
public class SmallTypeController {

    @Autowired
    private ISmallTypeService smallTypeService;

    /**
     * 查询轮播图片
     */
    @GetMapping("/findAll")
    public Result findAll(){
        List<SmallType> smallTypeList = smallTypeService.list();


        return Result.success(smallTypeList);
    }
}
