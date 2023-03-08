package semester_2.classwork.W7_Comparator_Stream;

import java.util.Arrays;
import java.util.List;

public class T3_2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100);

        int result = (int) list.stream().
                filter(v -> v % 10 == 0).count();

        System.out.println(result);
    }
}
