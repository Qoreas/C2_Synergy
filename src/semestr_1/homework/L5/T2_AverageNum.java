package semestr_1.homework.L5;

import java.util.ArrayList;
import java.util.Scanner;

public class T2_AverageNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        boolean stop = true;
        while (stop) {
            System.out.print("Input number: ");
            list.add(scan.nextInt());

            System.out.print("If you want to stop, input 0: ");
            if (scan.nextInt() == 0) {
                stop = false;
            }
        }

        int counter = 0;
        for (int i : list) {
            counter += i;
        }

        System.out.println("Average number: " + counter / list.size());
        System.out.println(list);
    }
}