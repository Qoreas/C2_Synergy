package semester1.module3.classwork.W7_Repeat2.ex1_Optional;

import java.util.HashMap;
import java.util.Optional;

public class Main1 {
    static HashMap<Integer, Person> students = new HashMap<>();

    public static void main(String[] args) {

        students.put(1, new Person("Boris"));
        students.put(2, new Person(null));
        students.put(3, null);

        Optional<Person> optPers1 = Optional.ofNullable(students.get(1));
        Optional<Person> optPers2 = Optional.ofNullable(students.get(2));
        Optional<Person> optPers3 = Optional.ofNullable(students.get(3));

//        if (optPers2.isPresent()) {
//            Person person = optPers2.get();
//            person.name = "Nile";
//            System.out.println(person);
//        }

        optPers1.ifPresent(person -> person.name = "ko");
        System.out.println(students.get(1));

        optPers3.ifPresentOrElse(person -> person.name = "WEQ",
                () -> System.out.println("Person not found"));

        System.out.println(getPersonName2(3));
        System.out.println(get3(3));
    }

    private static Optional<Person> getById(int id) {
        return Optional.ofNullable(students.get(id));
    }

    public static Person getPersonName1(int id) {
        return getById(id).orElse(new Person("Anonymous"));
    }

    public static Person getPersonName2(int id) {
        return getById(id).orElseGet(() -> {
            System.out.println("No person found");
            return new Person("Anonymous");
        });
    }

    public static Person get3(int id) {
        return getById(id).orElseThrow(() -> new RuntimeException("No element"));
    }
}
