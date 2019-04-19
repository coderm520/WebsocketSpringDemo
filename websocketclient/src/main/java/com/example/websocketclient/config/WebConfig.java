package com.example.websocketclient.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description TODO
 * @Author m110266
 * @Date 2019/4/19 11:02
 **/
//@Configuration
//@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8888/websockect-simple")
                .allowCredentials(false)
                .maxAge(3600)
                .allowedHeaders("Accept","Content-Type","Origin","Authorization","X-Auth-Token")
                .exposedHeaders("X-Auth-Token","Authorization")
                .allowedMethods("POST","GET","DELETE","PUT","OPTIONS");
    }
}
