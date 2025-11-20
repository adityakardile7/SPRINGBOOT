package com.example.demo;

import org.springframework.stereotype.Component;
@Component("myBean")
public class GreetingService {
    public void say(){
        System.out.println("Ram Ram Spring!");
    }
}
