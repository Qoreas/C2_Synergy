package semester_2.homework.P1_9.W1;

public class Teacher {
    public String name;

    Teacher(String name) {
        this.name = name;
    }

    public Student[] createStudentList(int size) {
        return new Student[size];
    }

    public static void showStudentsName(Student[] list) {
        System.out.println("Showing students: ");
        for (Student st : list) {
            System.out.print(st.name + " ");
        }
        System.out.println();
    }

    public static void sleepStudents(Student[] list) {
        System.out.println("Sleeping students");
        for (Student st : list) {
            System.out.print("Student " + st.name + ": ");
            st.sleep();
        }
    }
}
