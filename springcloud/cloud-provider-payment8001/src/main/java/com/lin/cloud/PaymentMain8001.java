package com.lin.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ccgg
 * @Date 2020/8/21 10:47
 */
@SpringBootApplication
@MapperScan("com.lin.cloud.mapper")
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
