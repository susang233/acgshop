package com.suziru.acgshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.suziru.acgshop.server.mapper")
public class AcGshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcGshopApplication.class, args);
    }

}
