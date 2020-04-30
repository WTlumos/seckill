package com.runaccepted.gmall.seckill.controller;

import com.runaccepted.gmall.seckill.entity.CommonResult;
import com.runaccepted.gmall.seckill.entity.SeckillOrder;
import com.runaccepted.gmall.seckill.service.SeckillOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SeckillOrderController {

    @Autowired
    SeckillOrderService orderService;

    @GetMapping("/order/{orderNo}")
    @ResponseBody
    public CommonResult findOrder(@PathVariable String orderNo){
        SeckillOrder order = orderService.findOrder(orderNo);
        if(order!=null){
            return CommonResult.ok("及时付款");
        }else{
            return CommonResult.error("继续等待");
        }
    }

    @GetMapping("/pay")
    public ModelAndView pay(){
        ModelAndView view = new ModelAndView("/pay");
        return view;
    }
}
