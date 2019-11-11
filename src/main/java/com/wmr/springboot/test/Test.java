package com.wmr.springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Test {
    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);
    }

    @RequestMapping("/")
    String home(){
        return "Hello spring boot";
    }
}
