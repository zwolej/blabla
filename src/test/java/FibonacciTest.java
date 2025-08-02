import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void testFibonacciWithinLimit() {
        Fibonacci fib = new Fibonacci();
        assertEquals(0, fib.calculate(0));
        assertEquals(1, fib.calculate(1));
        assertEquals(55, fib.calculate(10));
    }

    @Test
    public void testFibonacciExceedingLimit() {
        Fibonacci fib = new Fibonacci();
        assertThrows(IllegalArgumentException.class, () -> fib.calculate(101));
    }
}
