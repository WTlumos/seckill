package com.runaccepted.gmall.seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages = "com.runaccepted.gmall.seckill.mapper")
@EnableCaching
@EnableScheduling
public class GmallSeckillApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallSeckillApplication.class, args);
    }

}
