package com.runaccepted.gmall.seckill.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class SeckillActivity implements Serializable {

    private Integer id;
    private String goodsId;
    private Long secCount;
    private Date startTime;
    private Date endTime;
    private int status;
    private BigDecimal price;
}
