package semester1.module1.homework.L6;

import java.util.Scanner;

public class T2_ReplaceO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input sentence or word: ");
        String word = scan.nextLine();
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            // eng "o"
            if (word.toLowerCase().charAt(i) == 'o') {
                word = word.replaceFirst("o", "0");
                counter++;
            }
        }

        System.out.println(word);
        System.out.println(counter);
    }
}
