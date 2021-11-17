package com.electricangels.evp.controllers;

import com.electricangels.evp.models.Greeting;
import com.electricangels.evp.models.Message;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(Message message) throws Exception {
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getMessageString()));
    }
}
