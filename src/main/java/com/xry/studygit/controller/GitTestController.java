package com.xry.studygit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git")
public class GitTestController {

//    @RequestMapping("/learn")
//    public String gitLearn(){
//        return "good good study,day day up!";
//    }

    @RequestMapping("/learn")
    public String gitLearn(){
        return "good good study,day day up!";
    }

}
