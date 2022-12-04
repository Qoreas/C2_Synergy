package semestr_1.homework.L6;

import java.util.Scanner;

public class T3_WordCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input sentence or word: ");
        String word = scan.nextLine();
        String copy = word.toLowerCase();

        System.out.print("Input sentence or word to search: ");
        String search = scan.nextLine();
        search = search.toLowerCase();

        int counter = 0;

        for (int i = 0; i < copy.length(); i++) {
            if (copy.contains(search)) {
                copy = copy.replaceFirst(search, "");
                counter++;
            }
        }

        System.out.println();
        System.out.println("Word: " + word);
        System.out.println("Search: " + search);
        System.out.println("Count: " + counter);
    }
}