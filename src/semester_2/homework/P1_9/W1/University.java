package semester_2.homework.P1_9.W1;

public class University {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Alex Pavlovich");
        System.out.println(t1.name + "'s group.");

        Student[] group1 = t1.createStudentList(2);
        group1[0] = new Student("Petr");
        group1[1] = new Student("Ivan");
        Teacher.showStudentsName(group1);
        Teacher.sleepStudents(group1);
        System.out.println();

        Teacher t2 = new Teacher("Ivan Hetrov");
        System.out.println(t2.name + "'s group.");

        Student[] group2 = t2.createStudentList(2);
        group2[0] = new Student("Katya");
        group2[1] = new Student("Sasha");
        Teacher.showStudentsName(group2);
        Teacher.sleepStudents(group2);
        System.out.println();

        Teacher t3 = new Teacher("Aleksandr Il'ich");
        System.out.println(t3.name + "'s group.");

        Student[] group3 = t3.createStudentList(2);
        group3[0] = new Student("Helicopter");
        group3[1] = new Student("Submarine");
        Teacher.showStudentsName(group3);
        Teacher.sleepStudents(group3);


    }
}
