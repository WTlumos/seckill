package com.runaccepted.gmall.seckill.service;

import com.runaccepted.gmall.seckill.entity.SeckillOrder;

public interface SeckillOrderService {

    String sendOrdertoQueue(String userId);

    SeckillOrder findOrder(String orderNo);
}
