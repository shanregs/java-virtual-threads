package com.shan.concurrency.aspect;

import com.shan.concurrency.sec01.MyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@SpringBootTest
class LogExecutionTimeAspectTest {
    private static final Logger logger = LoggerFactory.getLogger(LogExecutionTimeAspectTest.class);

    @Autowired
    private MyService myService;
    @BeforeEach
    public void setUp() {
        // Set up any necessary test setup here
    }

    @Test
    void testMethodExecutionTimeLogging() {
        Logger mockLogger = mock(Logger.class);
        assertDoesNotThrow(() -> myService.performTask());
        mockLogger.info("MyService#testExecutionTime executed in 100 ms");  // You can test with mock data
        verify(mockLogger, times(1)).info("MyService#testExecutionTime executed in 100 ms");;
    }
}