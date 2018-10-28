package pl.coderstrust.pascal;

public class PascalTriangle {

    public static void main(String[] args) {
        printPascalTriangle(1);
        System.out.println();
        printPascalTriangle(3);
        System.out.println();
        printPascalTriangle(15);
    }

    public static void printPascalTriangle(int size) {
        long result;
        for (int i = 0; i < size; i++) {
            for (int j = i; j <= size; j++) {
                System.out.printf("%2c", ' ');
            }
            for (int k = 0; k <= i; k++) {
                result = factorial(i) / (factorial(k) * factorial(i - k));
                System.out.printf("%5d", result);
            }
            System.out.println();
        }
    }

    public static long factorial(long number) {
        long factorial = 1L;
        while (number >= 1) {
            factorial *= number;
            number--;
        }
        return factorial;
    }
}
