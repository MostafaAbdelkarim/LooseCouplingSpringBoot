package com.mostafaeldahshan.newtestproject;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Job{
    @Override
    public void display() {
        System.out.println("I'm a Doctor");
    }
}
