package pl.coderstrust.fibonacci;

public class FibonacciIterative {

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    private static long fibonacci(int fibonacciNumberInOrder) {
        int previousNumber = 0;
        int currentNumber = 1;
        int nextNumber;
        for (int i = 1; i < fibonacciNumberInOrder; i++) {
            nextNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }
        return currentNumber;
    }
}
