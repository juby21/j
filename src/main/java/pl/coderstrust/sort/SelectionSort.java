package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {-2, -5, 7, 1, 9, 5, -3};
        System.out.println("Array before selection sort ");
        System.out.println(Arrays.toString(array));
        System.out.println("Array after selection sort");
        int[] test = sort(array);
        System.out.print(Arrays.toString(test));
    }

    public static int[] sort(int[] array) {
        int[] tempArray = array;
        for (int i = 0; i < tempArray.length - 1; i++) {
            int minimalElementPosition = i;
            for (int j = i + 1; j < tempArray.length; j++) {
                if (tempArray[j] < tempArray[minimalElementPosition]) {
                    minimalElementPosition = j;
                }
            }
            swapPosition(tempArray, minimalElementPosition, i);
        }
        return tempArray;
    }

    public static int[] swapPosition(int[] array, int minimalElementPosition, int newPosition) {
        int[] tempArray = array;
        int temp = tempArray[minimalElementPosition];
        tempArray[minimalElementPosition] = tempArray[newPosition];
        tempArray[newPosition] = temp;
        return tempArray;
    }
}