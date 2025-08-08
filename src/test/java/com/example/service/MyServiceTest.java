package com.example.service;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MyServiceTest {

    @Test
    public void testServiceMethod2() {
        int val = new MyService().serviceMethod2();
        // Ensure val is >= 5 to pass test
        assertTrue("val is less than 5: " + val, val >= 5);
    }
}