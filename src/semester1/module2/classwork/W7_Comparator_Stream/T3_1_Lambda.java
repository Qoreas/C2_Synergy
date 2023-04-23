package semester1.module2.classwork.W7_Comparator_Stream;

import java.util.Arrays;
import java.util.List;

public class T3_1_Lambda {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = list.stream().
                mapToInt(i -> i * 2).sum();

        System.out.println(result);
    }
}
