package com.example;

public class Fibonacci {

    // Method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1, fib = 1;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
}
