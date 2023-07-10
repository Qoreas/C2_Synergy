package semester1.module3.homework.W7_Optional.ex1;

public class Address {
    private String city;
    private String region;

    public Address(String city, String region) {
        this.city = city;
        this.region = region;
    }

    public String city() {
        return city;
    }

    public String region() {
        return region;
    }

    @Override
    public String toString() {
        return "city='" + city + '\'' +
                        ", region='" + region;
    }
}
