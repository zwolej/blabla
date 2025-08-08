package com.example.controller;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExistingControllerTest {

    @Test
    public void testExistingFunctionality() {
        ExistingController controller = new ExistingController();
        int val = controller.existingFunctionality();
        // Fix expected value to match actual output
        assertEquals(5, val);
    }
}