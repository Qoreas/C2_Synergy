package HomeWork.P1_10.L5;

public class T1_Arrays {
    public static void main(String[] args) {
        int[] initAr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < initAr.length; i++) {
            if (initAr[i] % 2 == 0) {
                initAr[i] = 0;
            }

            System.out.print(initAr[i] + " ");
        }

        System.out.println();
        System.out.println("Cloning");


        int[] result = initAr.clone();

        for (int i : result) {
            System.out.print(i + " ");
        }

        /* вариант без clone
        int[] result = new int[initAr.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = initAr[i];
            System.out.print(result[i] + " ");
        }
        */
    }
}
