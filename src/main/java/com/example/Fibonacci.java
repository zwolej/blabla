public class Fibonacci {
    public static int calculateFibonacci(int position) {
        if (position < 0 || position > 100) {
            throw new IllegalArgumentException("Position must be between 0 and 100 inclusive.");
        }
        if (position <= 1) {
            return position;
        }
        int previousValue = 0;
        int currentValue = 1;
        for (int index = 2; index <= position; index++) {
            int nextValue = previousValue + currentValue;
            previousValue = currentValue;
            currentValue = nextValue;
        }
        return currentValue;
    }
}