package pl.coderstrust.fibonacci;

public class FibonacciRecursive {

    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(7));
    }

    private static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder == 0) {
            return 0;
        } else if (fibonacciNumberInOrder == 1) {
            return 1;
        } else {
            return fibonacci(fibonacciNumberInOrder - 1) + fibonacci(fibonacciNumberInOrder - 2);
        }
    }
}
