package com.runaccepted.gmall.seckill.controller;

import com.runaccepted.gmall.seckill.entity.CommonResult;
import com.runaccepted.gmall.seckill.entity.ResultCode;
import com.runaccepted.gmall.seckill.service.SeckillActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class SeckilActivityController {

    @Autowired
    SeckillActivityService activityService;

    /**
     * 返回抢购结果和订单orderno
     * @param id
     * @param userId
     * @return
     */
    @GetMapping("/seckill/{id}/{userId}")
    @ResponseBody
    public CommonResult processSecKill(@PathVariable  int id, @PathVariable String userId){
        String result = activityService.seckill(id,userId);
        CommonResult commonResult = CommonResult.ok("抢到了，等待订单生成！").data("orderNo",result);
        return commonResult;
    }

}
