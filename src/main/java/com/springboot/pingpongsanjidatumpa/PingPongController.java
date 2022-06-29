package com.springboot.pingpongsanjidatumpa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongController {

    @RequestMapping
    public String welcomeMessage(){
        return "Welcome to Sanjida Tumpa's Springboot Application";
    }

    @RequestMapping("/ping")
    public String pongMessage(){
        return "Pong";
    }

}
