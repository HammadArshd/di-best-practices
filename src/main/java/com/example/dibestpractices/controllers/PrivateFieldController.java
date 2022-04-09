package com.example.dibestpractices.controllers;

import com.example.dibestpractices.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@Controller
public class PrivateFieldController {

    @Autowired
    private MyService myService;

    @PostConstruct
    public String saySomething() {
        return myService.getHello();
    }
}
