package com.example.dibestpractices.controllers;

import com.example.dibestpractices.services.MyService;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@Controller
public class ConstructorController {

    private MyService myService;
//    private final MyService myService;

    public ConstructorController(MyService myService) {
        this.myService = myService;
    }

    @PostConstruct
    public String saySomething() {
        return myService.getHello();
    }
}
