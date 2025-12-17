package com.example.starter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}
