package com.xry.studygit.controller;

import com.xry.studygit.kafka.provider.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaSenderController {

    @Autowired
    private KafkaSender sender;

    @GetMapping("/send/{msg}")
    public String sendMessage(@PathVariable("msg") String msg) {
        sender.send(msg);
        return msg;
    }
}
