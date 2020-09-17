package com.acep.fqa.website;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.acep.fqa.website.dao")
@ServletComponentScan
public class FQApplication {

    public static void main(String[] args) {
        SpringApplication.run(FQApplication.class, args);
    }
}
