package com.demo.stream.controller;

import com.demo.stream.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Mr.裴
 * @create 2020/5/18
 * @Description:
 **/
@RestController
public class SendConteoller {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping("/send/msg")
    public String sendMessage(){
        return messageProvider.send();
    }

}
