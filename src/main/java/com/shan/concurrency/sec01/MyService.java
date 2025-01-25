package com.shan.concurrency.sec01;

import com.shan.concurrency.aspect.LogExecutionTime;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @LogExecutionTime
    public void performTask() {
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
