package com.jason;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jasoncc on 28/07/17.
 */

@MapperScan("com.jason.dao")
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class ApplicationDemo {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationDemo.class,args);
    }
}
