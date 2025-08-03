package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void testFibonacciPositive() {
        assertEquals(0, Fibonacci.fibonacci(0));
        assertEquals(1, Fibonacci.fibonacci(1));
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));
    }

    @Test
    public void testFibonacciNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.fibonacci(-1);
        });
        assertEquals("Input cannot be negative", exception.getMessage());
    }

    @Test
    public void testFibonacciLarge() {
        assertEquals(12586269025L, Fibonacci.fibonacci(50));
    }
}
