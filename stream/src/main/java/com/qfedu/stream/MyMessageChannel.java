package com.qfedu.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author 百泽
 * @公众号 Java架构栈
 */
public interface MyMessageChannel {
    String INPUT = "message-input";
    String OUTPUT = "message-output";

    @Output(OUTPUT)
    MessageChannel output();

    @Input(INPUT)
    SubscribableChannel input();
}
