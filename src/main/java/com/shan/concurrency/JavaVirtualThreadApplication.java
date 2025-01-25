package com.shan.concurrency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaVirtualThreadApplication {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        SpringApplication.run(JavaVirtualThreadApplication.class, args);
    }
}