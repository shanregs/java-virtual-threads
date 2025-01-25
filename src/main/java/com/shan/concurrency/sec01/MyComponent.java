package com.shan.concurrency.sec01;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private final MyService myService;

    public MyComponent(MyService myService) {
        this.myService = myService;
    }

    @PostConstruct
    public void init() {
        myService.performTask();
    }
}
