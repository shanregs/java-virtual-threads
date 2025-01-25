package com.shan.concurrency.sec01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class Task {
    private static final Logger log = LoggerFactory.getLogger(Task.class);

    public static void ioIntensiveService(int i) {
//        log.info("Starting IO intensive task");
        try {
            log.info("starting I/O task {}. Thread Info: {}", i, Thread.currentThread());
            Thread.sleep(Duration.ofSeconds(10).toMillis());
            log.info("Ending I/O task {}. Thread Info: {}", i, Thread.currentThread());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
