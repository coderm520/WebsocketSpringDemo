package com.example.websocketserver.entities;

import lombok.Data;

/**
 * @Description TODO
 * @Author m110266
 * @Date 2019/4/18 14:30
 **/
@Data
public class ResponseMessage {
    private Integer code;
    private String messageInfo;


    public ResponseMessage() {
    }

    public ResponseMessage(Integer code, String messageInfo) {
        this.code = code;
        this.messageInfo = messageInfo;
    }
}
