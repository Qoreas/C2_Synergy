package semestr_1.homework.L8;

import java.util.Arrays;
import java.util.Random;

public class T2_FastSort {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0 || low >= high) return;

        int middle = low + (high - low) / 2;
        int border = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < border) i++;

            while (array[j] > border) j--;

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(array, low, j);
        } else if (high > i) {
            quickSort(array, i, high);
        } else {
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);
        }

        quickSort(array, 0, array.length - 1);
    }
}