package semester1.module3.homework.W7_Optional.ex1;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Petr",
                Optional.of(new Address("Moscow", "Russia")));

        Student st2 = new Student("Masha",
                Optional.of(new Address("Spb", "Russia")));

        Student st3 = new Student("Igor");

        Student st4 = new Student("Slava",
                Optional.of(new Address("Kazan", "Russia")));

        Student st5 = new Student("Andrew");

        printStudentInfo(st1);
        printStudentInfo(st2);
        printStudentInfo(st3);
        printStudentInfo(st4);
        printStudentInfo(st5);
    }

    static void printStudentInfo(Student student) {
        student.address()
                .ifPresentOrElse(
                        st -> System.out.println(student),
                        () -> System.out.println(student.name())
                        );
    }
}
