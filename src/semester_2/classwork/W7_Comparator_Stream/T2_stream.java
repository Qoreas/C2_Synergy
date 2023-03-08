package semester_2.classwork.W7_Comparator_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class T2_stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six");

        Stream<String> stream = list.stream();
        stream.filter(s -> s.length() == 3).forEach(System.out::println);

    }
}
