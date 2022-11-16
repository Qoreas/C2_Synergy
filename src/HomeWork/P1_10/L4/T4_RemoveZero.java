package HomeWork.P1_10.L4;

import java.util.Scanner;

public class T4_RemoveZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input numbers from 0 till 9: ");
        String numbers = scan.next();

        numbers = numbers.replaceAll("0", "");
        System.out.println(numbers);
    }
}
