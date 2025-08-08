package com.example;

public class Fibonacci {

    /**
     * Computes the n-th Fibonacci number.
     * @param n the index (0-based) of the Fibonacci number.
     * @return the Fibonacci number at position n.
     */
    public static int fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Index cannot be negative");
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
