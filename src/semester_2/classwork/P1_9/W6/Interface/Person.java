package semester_2.classwork.P1_9.W6.Interface;

public class Person implements ShowInfo {
    String name;

    public Person(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hi!");
    }

    @Override
    public void show() {
        System.out.println(TYPE + " " + name);
    }
}
