package semester1.module3.homework.W7_Optional.ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List
                .of("Petr", "Masha", "Vanya", "Petya", "Loopa");

        System.out.println(names);
        System.out.println(names.stream()
                .reduce((s, s2) -> s + s2));
    }
}
