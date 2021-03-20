package com.cloud.wxxserver.wxxserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.cloud")
public class WxxServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxxServerApplication.class, args);
    }

}
