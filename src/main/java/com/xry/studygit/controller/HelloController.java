package com.xry.studygit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/say")
    public String say(){
        return "hello welcome to springboot";
    }

}
