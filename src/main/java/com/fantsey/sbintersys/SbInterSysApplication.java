package com.fantsey.sbintersys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fantsey.sbintersys.dao")
public class SbInterSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbInterSysApplication.class, args);
    }
}
