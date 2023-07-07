package semester1.module3.classwork.W6_Repeat.Ex1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(4, 5, 6);
        List<Integer> c = Arrays.asList(7, 8, 9);

        List<List<Integer>> abc = Arrays.asList(a, b, c);
        System.out.println(abc);
        abc.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::print);


    }
}
