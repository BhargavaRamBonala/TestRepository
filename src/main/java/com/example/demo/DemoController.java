package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/")
    public String hello(){
        return "Hello World from Spring Boot";
    }

    @RequestMapping("/goodbye")
    public String goodbye() {
        return "Goodbye from Spring Boot";
    }
}
