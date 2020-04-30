package com.runaccepted.gmall.seckill.service;

import com.runaccepted.gmall.seckill.entity.SeckillActivity;

import java.util.List;
import java.util.Map;

public interface SeckillActivityService {

    List<SeckillActivity> findUnstartSeckill();

    String seckill(int id, String userId);
}
