package com.runaccepted.gmall.seckill.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SeckillOrder implements Serializable {

    private Integer orderId;
    private String orderNo;
    private String tradeNo;
    private Integer orderStatus;
    private String userId;
    private Date createTime;
}
