package semester_2.classwork.P1_9.W6.Abstract;

public abstract class Animal {
    String name;
    void eat() {
        System.out.println("Animal is eating");
    }

    abstract void makeSound();
}
