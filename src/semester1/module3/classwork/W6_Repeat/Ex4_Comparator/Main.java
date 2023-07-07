package semester1.module3.classwork.W6_Repeat.Ex4_Comparator;

import semester1.module3.classwork.W6_Repeat.Ex3_sort_comparable.Wizard;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Wizard> wizards = new ArrayList<>();
        wizards.add(new Wizard(100, 300, "Jack"));
        wizards.add(new Wizard(30, 44440, "Mike"));
        wizards.add(new Wizard(50, 8888, "DOOR"));

        wizards.forEach(System.out::println);
        System.out.println("-----------------");

        Comparator<Wizard> comparatorHP = Comparator.comparing(Wizard::hp);
        wizards.stream()
                .sorted(comparatorHP)
                .forEach(System.out::println);
    }


}
