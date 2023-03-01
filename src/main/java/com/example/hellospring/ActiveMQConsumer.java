package com.example.hellospring;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQConsumer {


    /**
     * queue模式的消费者
     */
    @JmsListener(destination = "testq", containerFactory = "queueListener")
    public void readActiveQueue(String message) {
    }


}
