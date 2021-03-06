package org.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "org.springboot.dao")
public class SpringbootLockApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLockApplication.class, args);
    }

}
