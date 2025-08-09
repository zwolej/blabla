import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void testFibonacciValidInputs() {
        // Test base cases
        assertEquals(0, Fibonacci.calculateFibonacci(0));
        assertEquals(1, Fibonacci.calculateFibonacci(1));
        // Test first 10 Fibonacci numbers
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], Fibonacci.calculateFibonacci(i), "Fibonacci of " + i);
        }
    }

    @Test
    public void testFibonacciNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.calculateFibonacci(-5));
    }

    @Test
    public void testFibonacciLargeInputWithinReason() {
        // Example large input within reasonable limit to check performance and correctness
        int pos = 30;
        int result = Fibonacci.calculateFibonacci(pos);
        assertEquals(832040, result, "Fibonacci of 30 should be 832040");
    }

    @Test
    public void testFibonacciInputBoundary() {
        // Assuming if input beyond 100 is invalid as per original test
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.calculateFibonacci(101));
    }
}