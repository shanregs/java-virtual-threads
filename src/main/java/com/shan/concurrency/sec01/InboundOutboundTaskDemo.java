package com.shan.concurrency.sec01;

public class InboundOutboundTaskDemo {
    private static final int MAX_PLATFORM = 50_0000;
    private static final int MAX_VIRTUAL = 20;


    public static void main(String[] args) {
        platformThread();
    }

    private static void platformThread() {
        for (int i = 0; i < MAX_PLATFORM;i++) {
            int finalI = i;
            Thread t = new Thread(() -> Task.ioIntensiveService(finalI));
            t.start();
        }
    }
}
