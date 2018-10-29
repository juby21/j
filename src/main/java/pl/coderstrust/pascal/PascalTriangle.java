package pl.coderstrust.pascal;

public class PascalTriangle {

    public static void main(String[] args) {
        printPascalTriangle(10);
    }

    private static void printPascalTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = i; j <= size; j++) {
                System.out.printf("%2c", ' ');
            }
            int[] row = preparePascalTriangle(i);
            for (int j : row) {
                System.out.printf("%4d", j);
            }
            System.out.println();
        }
    }

    private static int[] preparePascalTriangle(int size) {
        int[] previousRow = {};
        for (int i = 0; i < size; i++) {
            int[] newRow = new int[i + 1];
            newRow[0] = 1;
            for (int j = 1; j < i; j++) {
                newRow[j] = previousRow[j - 1] + previousRow[j];
            }
            newRow[i] = 1;
            previousRow = newRow;
        }
        return previousRow;
    }
}
