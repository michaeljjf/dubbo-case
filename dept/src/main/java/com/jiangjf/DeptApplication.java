package com.jiangjf;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jiangjf
 * @date 2021/10/5
 */
@SpringBootApplication
@EnableDubbo
public class DeptApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptApplication.class, args);
    }
}
