package com.sucaisheng.web_scoket.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class WebSocketController {

    @RequestMapping("/websocket/{name}")
    public ModelAndView webSocket(@PathVariable String name, ModelAndView model) {
        try {
            log.info("跳转到websocket的页面上");
            model.addObject("username", name);
            model.setViewName("/webSocket.html");
            return model;
        } catch (Exception e) {
            log.info("跳转到websocket的页面上发生异常，异常信息是：" + e.getMessage());
            //return "error";
            model.setViewName("error.html");
            return model;
        }
    }
}