package pl.coderstrust.multiplication;

public class MultiplicationTable {

    public static void main(String[] args) {
        printMultiplicationTable(13);
    }

    public static void printMultiplicationTable(int size) {
        if (size > 12) {
            throw new IllegalArgumentException("Maximum supported size of Multiplication Table is 12x12");
        }
        System.out.print("    ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
