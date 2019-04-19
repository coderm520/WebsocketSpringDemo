package com.example.websocketserver.controller;

import com.example.websocketserver.entities.RequestMessage;
import com.example.websocketserver.entities.ResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
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
    //@SubscribeMapping("/topic/getResponse")
    @SendTo("/topic/getResponse")
    public ResponseMessage receiveMessage(RequestMessage requestMessage) {
        System.out.println("receive"+requestMessage.getSenderName());
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setCode(200);
        responseMessage.setMessageInfo("BroadcastCtl receive [" + number.incrementAndGet() + "] records");
        return responseMessage;
    }

}
