package com.impl;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImp implements TestService
{
    
    @Override
    public void sayHello()
    {
        System.out.println("say hello!!!");
        
    }
    
}
