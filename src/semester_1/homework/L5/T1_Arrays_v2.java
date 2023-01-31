package semester_1.homework.L5;

import java.util.ArrayList;

public class T1_Arrays_v2 {
    public static void main(String[] args) {
        ArrayList<Integer> initArray = new ArrayList<>();

        int j = 0;
        while (j <= 10) {
            initArray.add(j);
            j++;
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i : initArray) {
            if (i % 2 != 0) {
                result.add(i);
            }
        }

        System.out.println(result);
    }
}