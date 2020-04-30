package com.runaccepted.gmall.seckill.service.impl;

import com.runaccepted.gmall.seckill.entity.SeckillActivity;
import com.runaccepted.gmall.seckill.entity.User;
import com.runaccepted.gmall.seckill.entity.query.QueryUser;
import com.runaccepted.gmall.seckill.mapper.SeckillMapper;
import com.runaccepted.gmall.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    SeckillMapper mapper;

    @Autowired
    StringRedisTemplate redisTemplate;

    @Override
    @Cacheable(cacheNames = "user",key = "#queryUser.name")
    public List<User> list(QueryUser queryUser) {

        return mapper.selectUser(queryUser);
    }

    @Override
    public List<User> nearList(Integer min) {

        List<User> users = mapper.nearList(min);
        return users;
    }


}
