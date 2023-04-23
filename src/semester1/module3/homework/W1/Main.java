package semester1.module3.homework.W1;

public class Main {
    public static void main(String[] args) {
        Sword<Copper> sword = new Sword<>(new Copper());
        System.out.println(sword.checkEndurance());

        Sword<Steel> sword2 = new Sword<>(new Steel());
        System.out.println(sword2.checkEndurance());
    }
}
