package semester1.module1.homework.L8;

import java.util.Arrays;

public class T1_BubbleSortReverse {
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


        boolean sort = false;

        while (!sort) {
            sort = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    sort = false;
                }
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
