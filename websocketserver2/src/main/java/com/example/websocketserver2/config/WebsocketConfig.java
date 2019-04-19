package com.example.websocketserver2.config;

import com.example.websocketserver2.handler.DemoWebsocketTextHander;
import com.example.websocketserver2.interceptor.WebsocketHandShakeInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * @Description TODO
 * @Author m110266
 * @Date 2019/4/19 16:09
 **/
@EnableWebSocket
@Configuration
public class WebsocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        String[] allowsOrigins = {"http://localhost:7777"};
        webSocketHandlerRegistry
                .addHandler(demoWebsocketTextHander(),"/marco")
                .addInterceptors(new WebsocketHandShakeInterceptor())
                .setAllowedOrigins(allowsOrigins);
    }

    @Bean
    public DemoWebsocketTextHander demoWebsocketTextHander(){
        return  new DemoWebsocketTextHander();
    }
}
