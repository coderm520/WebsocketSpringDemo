package com.example.websocketserver.entities;

import lombok.Data;

/**
 * @Description TODO
 * @Author m110266
 * @Date 2019/4/18 14:30
 **/
@Data
public class RequestMessage {
    private String senderName;
    private String messageInfo;

    public RequestMessage() {
    }

    public RequestMessage(String senderName, String messageInfo) {
        this.senderName = senderName;
        this.messageInfo = messageInfo;
    }
}
