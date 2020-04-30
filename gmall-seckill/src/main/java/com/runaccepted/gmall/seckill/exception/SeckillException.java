package com.runaccepted.gmall.seckill.exception;

import lombok.Data;

@Data
public class SeckillException  extends Exception{

    private String msg;

    public SeckillException(String message) {
        super(message);
    }
}
