package pl.coderstrust.fibonacci;

public class FibonacciIterative {

    public static void main(String[] args) {
        System.out.println(fibonacci(-1));
    }

    public static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder < 1) {
            throw new IllegalArgumentException("The Fibonacci numbers can not be less than 1 ");
        }
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
