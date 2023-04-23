package semester1.module2.classwork.W6.Interface;

public class Animal implements ShowInfo {
    int id;

    public Animal(int id) {
        this.id = id;
    }

    void sleep() {
        System.out.println("Im sleeping... ");
    }

    @Override
    public void show() {
        System.out.println("Id is " + id);
    }
}
