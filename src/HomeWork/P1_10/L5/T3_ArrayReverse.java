package HomeWork.P1_10.L5;

import java.util.Scanner;

public class T3_ArrayReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input array size: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.println("Input numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
