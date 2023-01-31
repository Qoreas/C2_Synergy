package semestr_2.homework.P1_9.HW1;

public class Student {
    public String name;
    public int age = 0;
    private int bankId;

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    Student(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("Student " + name + " is working");
    }

    public void sleep() {
        System.out.println("Student is sleeping");
    }
}
