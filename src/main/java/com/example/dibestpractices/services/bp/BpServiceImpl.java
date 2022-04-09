package com.example.dibestpractices.services.bp;

import org.springframework.stereotype.Service;

@Service
public class BpServiceImpl implements BpService{

    @Override
    public String getHello() {
        return "The Best Hello!";
    }
}
