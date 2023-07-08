package semester1.module3.classwork.W7_Repeat2.ex3_collect_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        Stream<String> namesStream = Stream.of("Alexander", "Jily", "Popkins", "lower", "hp");
        ArrayList<String> longNames = namesStream
                .filter(s -> s.length() > 5)
                .collect(
                        ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll
                );
        System.out.println(longNames);
    }
}
