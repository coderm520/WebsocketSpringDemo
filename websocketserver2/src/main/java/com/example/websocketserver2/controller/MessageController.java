package com.example.websocketserver2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * @Description TODO
 * @Author m110266
 * @Date 2019/4/18 14:35
 **/
@Controller
public class MessageController {
    private static final Logger logger= LoggerFactory.getLogger(MessageController.class);
    private AtomicInteger number=new AtomicInteger();

    @MessageMapping("/hello")
    @SendTo("/topic/getResponse")
    public String receiveMessage(String requestMessage) {
        return requestMessage + "-11111111111";
    }

}
