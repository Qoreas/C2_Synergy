package semester1.module3.classwork.W6_Repeat.Ex3_sort_comparable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Wizard> wizards = new ArrayList<>();
        wizards.add(new Wizard(100, 300, "Jack"));
        wizards.add(new Wizard(30, 44440, "Mike"));
        wizards.add(new Wizard(50, 8888, "DOOR"));

        wizards.forEach(System.out::println);
        System.out.println("-----------------");

        wizards.stream()
//                .sorted((o1, o2) -> o1.hp - o2.hp)
                .sorted()
                .forEach(System.out::println);
    }
}
