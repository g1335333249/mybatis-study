package com.g1335333249;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.g1335333249.mapper")
public class MybatisStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisStudyApplication.class, args);
    }

}
