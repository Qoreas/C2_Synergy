package semester1.module3.homework.W7_Optional.ex1;

import semester1.module3.homework.W7_Optional.ex1.Address;

import java.util.Optional;

public class Student {
    private String name;
    private Optional<Address> address;

    public Student(String name, Optional<Address> address) {
        this.name = name;
        this.address = address;
    }

    public Student(String name) {
        this.name = name;
        address = Optional.empty();
    }

    public String name() {
        return name;
    }

    public Optional<Address> address() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
