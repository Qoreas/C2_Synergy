package semester1.module3.classwork.W6_Repeat.Ex1;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<MapTest> testMap = new ArrayList<>();
        testMap.add(new MapTest("aaa", 33333));
        testMap.add(new MapTest("bbb", 53553));
        testMap.add(new MapTest("ccc", 11));
        testMap.add(new MapTest("ddd", 424343234));
        testMap.add(new MapTest("ggg", 23));
        testMap.add(new MapTest("eee", 1));

        testMap.stream()
                .map(s -> s.testStr)
                .forEach(System.out::println);
    }
}
