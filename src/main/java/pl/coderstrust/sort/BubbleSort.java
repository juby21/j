package pl.coderstrust.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int array[] = {8, 4, 7, 1, 9, 5, -3};
        System.out.println("Array before bubble sort ");
        for (int i : array) {
            System.out.printf("%d%s", i, ", ");
        }
        System.out.printf("%s%s%s", "\n", "Array after bubble sort", "\n");
        int test[] = sort(array);
        for (int i : test) {
            System.out.printf("%d%s", i, ", ");
        }
    }

    private static int[] sort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }
}
