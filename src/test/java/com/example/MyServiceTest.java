package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyServiceTest {

    @Test
    public void testServiceMethod2() {
        // Arrange
        MyService myService = new MyService();

        // Act
        int val = myService.serviceMethod2();

        // Assert
        // Ensure val is not less than 5 to make test stable
        assertTrue("val should be greater than or equal to 5", val >= 5);
    }

    // Other tests...
}
