package semester1.module2.classwork.W6.Abstract;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal wet = new Cat();

        dog.name = "Patrik";
        System.out.println(dog.name);
        dog.eat();
        cat.eat();

        dog.makeSound();
        cat.makeSound();
        wet.makeSound();
    }
}
