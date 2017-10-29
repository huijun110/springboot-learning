package com.jecy.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
    @Autowired
    private AuthorConfig config;
    @RequestMapping(value = "/")
    public String test() {
        return "Hello Spring Boot："+config.getName();
    }
}
