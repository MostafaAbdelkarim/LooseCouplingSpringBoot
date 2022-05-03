package com.mostafaeldahshan.newtestproject;

import org.springframework.stereotype.Component;

@Component
public class Plumber implements Job{
    @Override
    public void display() {
        System.out.println("I'm a Plumber");
    }
}
