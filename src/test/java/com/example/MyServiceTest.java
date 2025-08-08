package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

public class MyServiceTest {

    @Test
    public void testServiceMethod1() {
        assertEquals(5, 2 + 3);
    }

    @Test
    public void testServiceMethod2() {
        Random random = new Random();
        int val = random.nextInt(10);
        // Introduce a random failure: fail if val is less than 5
        assertTrue(val >= 5, "Random failure: val is less than 5: " + val);
    }

    @Test
    public void testServiceMethod3() {
        assertNotNull(new Object());
    }
}
