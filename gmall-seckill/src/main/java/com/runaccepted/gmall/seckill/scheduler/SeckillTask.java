package com.runaccepted.gmall.seckill.scheduler;

import com.runaccepted.gmall.seckill.entity.User;
import com.runaccepted.gmall.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class SeckillTask {

    @Autowired
    UserService userService;

    //@Scheduled(cron = "0 0/1 * * * ?")
    public void doTask(){
        List<User> users = userService.nearList(5);
        System.out.println(users);
    }
}
