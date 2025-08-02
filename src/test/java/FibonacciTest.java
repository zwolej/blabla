import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.calculateFibonacci(-1));
    }

    @Test
    public void testLargeInput() {
        assertEquals(1346269, Fibonacci.calculateFibonacci(25), "Unexpected value for position 25");
    }
}
