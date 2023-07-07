package semester1.module3.homework.W6_StreamApi;

public class Phone implements Comparable<Phone>{
    String manufacturer;
    String model;
    int cost;

    public Phone(String manufacturer, String model, int cost) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(Phone o) {
        return this.cost - o.cost;
    }
}
