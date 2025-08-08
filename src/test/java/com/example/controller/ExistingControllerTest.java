package com.example.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ExistingControllerTest {

    @Test
    public void testExistingFunctionality() {
        int expected = 5;
        int actual = 5;
        // Modify the assertion to cause a failure on purpose
        assertEquals(expected + 1, actual, "Intentional failure to test pipeline");
    }

    // ... other test methods ...
}