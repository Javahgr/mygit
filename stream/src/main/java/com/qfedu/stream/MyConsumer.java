package com.qfedu.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * @author 百泽
 * @公众号 Java架构栈
 */
@Component
@EnableBinding(Sink.class)
public class MyConsumer {
    /**
     * 监听一个输入通道
     * @param msg
     */
    @StreamListener(Sink.INPUT)
    public void receive(String msg) {
        System.out.println("msg = " + msg);
    }
}
