package semester_2.classwork.P1_9.W2;

import java.util.ArrayList;

public class initialization {
    public static void main(String[] args) {
        ArrayList<Integer> numbersId = new ArrayList<>();
        numbersId.add(20);
        ArrayList<Integer> numbers = new ArrayList<>(numbersId);
        numbers.add(1);
        numbers.add(3);
        numbers.addAll(numbersId);
        numbers.add(0, 100);
        numbers.set(0, 3333);
        Integer a = numbers.get(numbers.size() - 1);
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(a);
        System.out.println("you have a lot of money");
    }
}
