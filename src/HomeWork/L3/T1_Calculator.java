package HomeWork.L3;

import java.util.Scanner;

public class T1_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double result = 0;

        System.out.print("Input first number: ");
        double num1 = scan.nextInt();

        System.out.print("Choose the action: ");
        String action = scan.next();

        System.out.print("Input second number: ");
        double num2 = scan.nextInt();

        switch (action) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            default -> System.out.println("Incorrect input");
        }

        System.out.println("Result = " + result);
    }
}