public class Fibonacci {
    public static long fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative index not allowed");
        if (n == 0) return 0;
        if (n == 1) return 1;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
