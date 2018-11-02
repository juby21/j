package pl.coderstrust.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {-2, -5, 7, 1, 9, 5, -3};
        System.out.println("Array before selection sort ");
        System.out.println(Arrays.toString(array));
        System.out.println("Array after selection sort");
        int[] test = sort(array);
        System.out.print(Arrays.toString(test));
    }

    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    swapPosition(array, j);
                }
            }
        }
        return array;
    }

    public static int[] swapPosition(int[] array, int position) {
        int[] tempArray = array;
        int temp = tempArray[position];
        tempArray[position] = tempArray[position - 1];
        tempArray[position - 1] = temp;
        return tempArray;
    }
}