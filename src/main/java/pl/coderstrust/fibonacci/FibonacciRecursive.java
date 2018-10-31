package pl.coderstrust.fibonacci;

public class FibonacciRecursive {

    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(7));
    }

    public static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder < 1) {
            throw new IllegalArgumentException("The Fibonacci numbers can not be less than 1 ");
        }
        if (fibonacciNumberInOrder <= 2) {
            return 1;
        } else {
            return fibonacci(fibonacciNumberInOrder - 1) + fibonacci(fibonacciNumberInOrder - 2);
        }
    }
}
