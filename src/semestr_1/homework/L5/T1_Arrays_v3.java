package semestr_1.homework.L5;

public class T1_Arrays_v3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }

            result[i] = array[i];

            System.out.print(result[i] + " ");
        }
    }
}