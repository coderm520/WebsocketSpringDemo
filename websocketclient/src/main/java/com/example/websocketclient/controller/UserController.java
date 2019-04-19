package com.example.websocketclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description TODO
 * @Author m110266
 * @Date 2019/4/18 16:56
 **/
@Controller
public class UserController {

    @RequestMapping(value = "/user/index")
    public ModelAndView index(HttpServletRequest request){
        System.out.println(request.getRemoteHost());

        ModelAndView mv=new ModelAndView();
        mv.setViewName("/index");
        mv.addObject("title","aaaa");
        return mv;
    }
}
