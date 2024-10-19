package com.suziru.acgshop.server.controller.admin;

import com.suziru.acgshop.common.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/szr")
public class TestController {
    @GetMapping("/test")
    public Result test(){
        return Result.success("ok");
    }
}
