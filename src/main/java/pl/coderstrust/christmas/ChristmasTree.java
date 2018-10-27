package pl.coderstrust.christmas;

public class ChristmasTree {
    public static void main(String[] args) {

        printChristmasTree(7);
    }

    public static void printChristmasTree(int size) {

        int empty = size;
        int star = 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < empty; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < star; k++) {
                System.out.print("*");
            }
            System.out.println("*");
            empty--;
            star += 2;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.print("*");

    }
}
