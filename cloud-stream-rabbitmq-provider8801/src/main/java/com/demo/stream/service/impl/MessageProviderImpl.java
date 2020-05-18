package com.demo.stream.service.impl;

import com.demo.stream.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author: Mr.裴
 * @create 2020/5/18
 * @Description:
 **/
//定义消息的推送管道
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    //消息发送管道
    private MessageChannel output;

    @Override
    public String send() {
        String str = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(str).build());
        System.out.println("*****str:" + str);
        return null;
    }
}
