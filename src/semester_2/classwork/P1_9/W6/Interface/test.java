package semester_2.classwork.P1_9.W6.Interface;

public class test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");
        animal.sleep();
        person.sayHello();
        person.show();
        animal.show();

        ShowInfo i = new Person("Mas");
        i.show();


    }
}
