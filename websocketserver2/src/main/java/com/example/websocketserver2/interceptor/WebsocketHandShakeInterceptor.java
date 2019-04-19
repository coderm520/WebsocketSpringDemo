package com.example.websocketserver2.interceptor;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @Description TODO
 * @Author m110266
 * @Date 2019/4/19 17:00
 **/
public class WebsocketHandShakeInterceptor implements HandshakeInterceptor {
    @Override
    public boolean beforeHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Map<String, Object> map) throws Exception {
        ServletServerHttpRequest request=(ServletServerHttpRequest)serverHttpRequest;
        ServletServerHttpResponse response=(ServletServerHttpResponse)serverHttpResponse;

        HttpServletResponse httpServletResponse=response.getServletResponse();
        httpServletResponse.addHeader("Access-Control-Allow-Origin","http://localhost:7777");
        httpServletResponse.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
        httpServletResponse.addHeader("Access-Control-Allow-Headers", "X-PINGOTHER, Origin, X-Requested-With, Content-Type, Accept");
        httpServletResponse.addHeader("Access-Control-Max-Age", "1728000");
        map.put("aaaa","bbbbbbb");
        return true;
    }

    @Override
    public void afterHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Exception e) {

    }
}
