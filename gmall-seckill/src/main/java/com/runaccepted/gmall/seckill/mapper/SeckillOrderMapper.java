package com.runaccepted.gmall.seckill.mapper;

import com.runaccepted.gmall.seckill.entity.SeckillOrder;

public interface SeckillOrderMapper {

   int insertOrder(SeckillOrder order);

  SeckillOrder findbyOrderNo(String orderNo);
}
