package semester1.module1.homework.L7;

import semester1.module1.util.SScan;

public class T2_FindWordChar_v2 {
    public static void main(String[] args) {
        String word = SScan.getString();
        String search = SScan.getString().toLowerCase();
        int index = -1;

        for (int i = 0; i < word.length(); i++) {
            int j = 0;

            while (j < search.length() && i + j < word.length() && search.charAt(j) == word.charAt(i + j)) {
                j++;
            }

            if (j == search.length()) {
                index = i;
            }

        }

        if (index == -1) {
            System.out.println("Word not found");
        } else {
            System.out.println(index);
        }
    }
}
