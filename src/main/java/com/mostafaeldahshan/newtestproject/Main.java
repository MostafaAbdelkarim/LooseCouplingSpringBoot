package com.mostafaeldahshan.newtestproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args)
    {
        // SpringApplication.run(NewTestProjectApplication.class, args);
        ApplicationContext context = SpringApplication.run(Main.class, args);
        Job newJob = context.getBean(Doctor.class);
        newJob.display();
    }

}
