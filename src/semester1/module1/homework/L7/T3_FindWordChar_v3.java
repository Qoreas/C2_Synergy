package semester1.module1.homework.L7;

import semester1.module1.util.SScan;

public class T3_FindWordChar_v3 {
    public static void main(String[] args) {
        String word = SScan.getString();
        String search = SScan.getString();

        int index = word.indexOf(search);

        System.out.println(index);
    }
}
