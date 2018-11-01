package pl.coderstrust.sort;

public class SelectionSort {

    public static void main(String[] args) {
        int array[] = {8, 4, 7, 1, 9, 5, -3};
        System.out.println("Array before selection sort ");
        for (int i : array) {
            System.out.printf("%d%s", i, ", ");
        }
        System.out.printf("%s%s%s", "\n", "Array after selection sort", "\n");
        int test[] = sort(array);
        for (int i : test) {
            System.out.printf("%d%s", i, ", ");
        }
    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int temp;
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }
}

