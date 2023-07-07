package semester1.module3.homework.W6_StreamApi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("Samsug", "KIE-DD", 10_000));
        phoneList.add(new Phone("Samsug", "JOES-04", 113_000));
        phoneList.add(new Phone("Paer", "FEWS-1", 3_000));
        phoneList.add(new Phone("DOEWS", "KOD-ULTRA+", 66_000));
        phoneList.add(new Phone("DOEWS", "HEC-DORT", 150_000));
        phoneList.add(new Phone("Samsug", "KIE-333", 15_000));
        phoneList.add(new Phone("Paer", "FEWS-554", 43_200));

        List<Phone> sortedList = phoneList.stream()
                .filter(phone -> phone.manufacturer.equals("Samsug"))
                .toList();

        System.out.println(sortedList);
        System.out.println("--------------------");

        sortedList.stream()
                .sorted()
                .map(phone -> "Model=" + phone.model + "; cost=" + phone.cost + '.')
                .forEach(System.out::println);
    }
}
