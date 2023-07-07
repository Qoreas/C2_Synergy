package semester1.module3.classwork.W6_Repeat.StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "he", "ettert", "uu65", "h5y5", "hyhew");

        list.forEach(s -> System.out.println(s + '-' + s.length()));
        System.out.println();
        list.stream()
                .filter(s -> s.contains("e"))
                .forEach(System.out::println);

    }
}
