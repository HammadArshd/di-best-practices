package com.example.dibestpractices.controllers.bp;

import com.example.dibestpractices.services.bp.BpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@Controller
public class BpFinalConstructorWithLLombokController {

    private final BpService bpService;
    // lombok's RequiredArgsConstructor will provide the constructor
    // Spring will automatically autowire to that constructor

    @PostConstruct
    public String saySomething() {
        return bpService.getHello();
    }
}
