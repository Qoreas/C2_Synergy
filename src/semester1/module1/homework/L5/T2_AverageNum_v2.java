package semester1.module1.homework.L5;

import java.util.Scanner;

public class T2_AverageNum_v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input array size: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.println("Input numbers: ");
        double counter = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
            counter += array[i];
        }

        System.out.println("Average number: " + counter / size);
    }
}