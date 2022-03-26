package com.qfedu.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 百泽
 * @公众号 Java架构栈
 */
@RestController
public class HelloController {

    @Autowired
    MyMessageChannel myMessageChannel;

    @GetMapping("/hello")
    public void hello() {
//        Message msg = MessageBuilder.withBody("hello spring cloud stream!".getBytes()).build();
        for (int i = 0; i < 10; i++) {
            Message<String> msg = MessageBuilder.withPayload("hello spring cloud stream!").build();
            myMessageChannel.output().send(msg);
        }
    }
}