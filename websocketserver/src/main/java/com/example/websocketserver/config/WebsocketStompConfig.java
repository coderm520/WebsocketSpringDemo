package com.example.websocketserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @Description TODO
 * @Author m110266
 * @Date 2019/4/18 15:09
 **/
@Configuration
@EnableWebSocketMessageBroker
public class WebsocketStompConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/websocket-simple")
                .setAllowedOrigins("http://localhost:7777")
                .withSockJS();
        //.setInterceptors(new WebSocketHandshakeInterceptor());
    }

//    @Override
//    public void configureClientInboundChannel(ChannelRegistration registration) {
//        registration.interceptors(new WebSocketHandleInterceptor());
//    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic","queue");
        registry.setApplicationDestinationPrefixes("/app");
    }


}
