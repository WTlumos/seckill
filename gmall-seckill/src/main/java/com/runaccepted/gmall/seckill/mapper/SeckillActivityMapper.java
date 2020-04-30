package com.runaccepted.gmall.seckill.mapper;

import com.runaccepted.gmall.seckill.entity.SeckillActivity;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface SeckillActivityMapper {

    List<SeckillActivity> findUnstartSeckill();

    int update(SeckillActivity activity);

    //@Cacheable(cacheNames = "seckill",key = "#id",condition = "#result.status==1")
    SeckillActivity findById(int id);

    List<SeckillActivity> selectEndSeckill();
}
