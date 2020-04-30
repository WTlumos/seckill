package com.runaccepted.gmall.seckill.service;

import com.runaccepted.gmall.seckill.entity.SeckillActivity;
import com.runaccepted.gmall.seckill.entity.User;
import com.runaccepted.gmall.seckill.entity.query.QueryUser;

import java.util.List;

public interface UserService
{
    List<User> list(QueryUser queryUser);

    List<User> nearList(Integer min);


}
