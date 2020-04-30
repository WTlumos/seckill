package com.runaccepted.gmall.seckill.mapper;

import com.runaccepted.gmall.seckill.entity.SeckillActivity;
import com.runaccepted.gmall.seckill.entity.User;
import com.runaccepted.gmall.seckill.entity.query.QueryUser;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SeckillMapper {

    List<User> selectUser(QueryUser queryUser);

    List<User> nearList(Integer min);


}
