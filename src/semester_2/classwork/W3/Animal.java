package semester_2.classwork.W3;

public class Animal {
    public void say() {
        System.out.println("Animal says");
    }
}

class Dod extends Animal {
    @Override
    public void say() {
        System.out.println("Dog says");
    }
}