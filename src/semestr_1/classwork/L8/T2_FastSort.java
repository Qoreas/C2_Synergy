package semestr_1.classwork.L8;

import java.util.Arrays;

public class T2_FastSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
            if (i != array.length) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i]);
            }
        }

        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int middleIndex = (leftIndex + rightIndex) / 2;

        do {
            while (array[leftIndex] < array[middleIndex]) {
                leftIndex++;
            }

            while (array[rightIndex] > array[middleIndex]) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                if (leftIndex < rightIndex) {

                    int temp = array[leftIndex];
                    array[leftIndex] = array[rightIndex];
                    array[rightIndex] = temp;
                }

                leftIndex++;
                rightIndex--;
            }
        } while (leftIndex <= rightIndex);

        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
