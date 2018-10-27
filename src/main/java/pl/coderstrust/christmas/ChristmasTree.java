package pl.coderstrust.christmas;

public class ChristmasTree {
    public static void main(String[] args) {
        printChristmasTree(7);
    }
    public static void printChristmasTree(int size) {
        int numberOfAsterisk = 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= numberOfAsterisk; k++) {
                System.out.print("*");
            }
            numberOfAsterisk += 2;
            System.out.println();
        }
        printChristmasTreeTrunk(size);
    }

    private static void printChristmasTreeTrunk(int heightOfTree) {
        for (int i = 1; i < heightOfTree - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("**");
    }
}
