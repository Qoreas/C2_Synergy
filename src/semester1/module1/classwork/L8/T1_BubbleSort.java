package semester1.module1.classwork.L8;

import java.util.Arrays;

public class T1_BubbleSort {
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

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
