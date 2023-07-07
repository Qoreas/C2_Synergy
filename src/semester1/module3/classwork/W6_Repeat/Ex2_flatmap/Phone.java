package semester1.module3.classwork.W6_Repeat.Ex2_flatmap;

public class Phone {
    public String manufacture;
    public String model;
    private int price;

    public Phone(String manufacture, String model, int price) {
        this.manufacture = manufacture;
        this.model = model;
        this.price = price;
    }

    public int price() {
        return price;
    }
}
