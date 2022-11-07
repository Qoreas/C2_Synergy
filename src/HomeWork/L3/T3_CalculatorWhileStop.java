package HomeWork.L3;

import java.util.Scanner;

public class T3_CalculatorWhileStop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double result = 0;
        boolean stop = true;

        while (stop) {
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
            System.out.print("If you want to stop calculate - input 1: ");
            int end = scan.nextInt();

            if (end == 1) {
                stop = false;
            }
        }
    }
}