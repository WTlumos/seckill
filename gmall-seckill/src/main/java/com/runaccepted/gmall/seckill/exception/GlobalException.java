package com.runaccepted.gmall.seckill.exception;

import com.runaccepted.gmall.seckill.entity.CommonResult;
import com.runaccepted.gmall.seckill.entity.ResultCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public CommonResult getException(Exception e){
        return CommonResult.error(e.getMessage());
    }
}
