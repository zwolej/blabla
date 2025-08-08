package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.example.Fibonacci;

public class FibonacciTest {

    @Test
    public void testFibonacciWithinLimit() {
        assertEquals(0, Fibonacci.calculateFibonacci(0));
        assertEquals(1, Fibonacci.calculateFibonacci(1));
        assertEquals(55, Fibonacci.calculateFibonacci(10));
    }

    @Test
    public void testFibonacciExceedingLimit() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.calculateFibonacci(101));
    }
}