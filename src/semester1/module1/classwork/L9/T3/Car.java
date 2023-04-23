package semester1.module1.classwork.L9.T3;


public class Car {
    String color;
    String engine;
    int speed;

    Car() {
    }

    Car(String color, String engine, int speed) {
        this.color = color;
        this.engine = engine;
        this.speed = speed;
    }

    int start(int up) {
        return speed += up;
    }

    int stop(int down) {
        return speed -= down;
    }

    void showInfo() {
        System.out.println("Color: " + color);
        System.out.println("Engine: " + engine);
        System.out.println("Speed: " + speed);
    }
}

class Car_test {
    public static void main(String[] args) {
        Car bmw = new Car();

        bmw.speed = 10;
        bmw.color = "White";
        bmw.engine = "V6";

        bmw.showInfo();
        System.out.println();

        bmw.start(10);
        bmw.showInfo();

        System.out.println();

        Car audi = new Car("Black", "V8", 0);
        audi.showInfo();
    }
}