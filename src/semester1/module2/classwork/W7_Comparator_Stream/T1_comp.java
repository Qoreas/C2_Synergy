package semester1.module2.classwork.W7_Comparator_Stream;

import java.util.ArrayList;
import java.util.Comparator;

public class T1_comp {
    public static void main(String[] args) {
        String[] l1 = {"Hi", "bye"};
        String[] l2 = {"ojv", "what", "ffe"};
        String[] l3 = {"yo"};

        ArrayList<String[]> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);

        Comparator<String[]> sortByLength = ((o1, o2) -> o2.length - o1.length);

        list.sort(sortByLength);
        for (String[] l : list) {
            for (String str : l) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
