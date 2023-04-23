package semester1.module1.homework.L7;

import semester1.module1.util.SScan;

public class T2_FindWordChar {
    public static void main(String[] args) {
        String word = SScan.getString();
        String search = SScan.getString();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == search.charAt(0)) {
                System.out.println("Element position: " + i);
                break;
            }
        }
    }
}
