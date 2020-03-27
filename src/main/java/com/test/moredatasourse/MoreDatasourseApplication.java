package com.test.moredatasourse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.test.moredatasourse.mapper")
public class MoreDatasourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoreDatasourseApplication.class, args);
    }

}
