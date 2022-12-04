package semestr_1.homework.L6;

import java.util.Scanner;

public class T1_FenceWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input word: ");
        String word = scan.nextLine(), copy = "";

        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                copy += word.toUpperCase().charAt(i);
            } else {
                copy += word.toLowerCase().charAt(i);
            }
        }

        System.out.println(copy);
    }
}