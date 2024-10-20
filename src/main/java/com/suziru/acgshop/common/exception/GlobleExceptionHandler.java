package com.suziru.acgshop.common.exception;

import com.suziru.acgshop.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
@ControllerAdvice
@ResponseBody
public class GlobleExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public Result exceptionHandler(HttpServletRequest request,Exception e){
        return Result.error("服务端异常，请联系管理员"+"<br/>"+e.getMessage());
    }
}
