package semester1.module3.classwork.W6_Repeat.Ex2_flatmap;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Pers", "UTF3-2", 100_000));
        phones.add(new Phone("Pers", "HEERRD-21", 50_000));
        phones.add(new Phone("Wessag", "NOK-D1", 6_000));

        phones.stream()
                .filter(phone -> phone.manufacture.equals("Pers"))
                .map(phone -> phone.model + "; price=" + phone.price())
                .forEach(System.out::println);

        System.out.println();

        phones.stream()
                .filter(phone -> phone.price() < 60_000)
                .flatMap(phone -> Stream.of(phone.manufacture, phone.model))
                .forEach(s -> System.out.print(s + " "));
    }
}
