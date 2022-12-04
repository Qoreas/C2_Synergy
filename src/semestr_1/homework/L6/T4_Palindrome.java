package semestr_1.homework.L6;

import java.util.Scanner;

public class T4_Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input sentence or word: ");
        String word = scan.nextLine();
        String copy = "";

        for (int i = word.length(); i >= 0; i--) {
            try {
                copy += word.charAt(i);

            } catch (IndexOutOfBoundsException ignored) {}
        }

        System.out.println(word + " " + copy);

        if (word.equals(copy)) {
            System.out.println("This is palindrome: " + word);
        } else {
            System.out.println("This isn't palindrome: " + word);
        }
    }
}