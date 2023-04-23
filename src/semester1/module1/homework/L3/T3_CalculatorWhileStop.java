package semester1.module1.homework.L3;

import java.util.Scanner;

public class T3_CalculatorWhileStop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2, result = 0;
        boolean stop = true;
        int end;

        while (stop) {
            System.out.print("Input first number: ");
            num1 = scan.nextDouble();

            System.out.print("Choose the action: ");
            String action = scan.next();

            System.out.print("Input second number: ");
            num2 = scan.nextDouble();

            switch (action) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
                default -> System.out.println("Incorrect input");
            }

            System.out.println("Result = " + result);
            System.out.print("If you want to stop calculate - input 1, else 0: ");
            end = scan.nextInt();

            if (end == 1) {
                stop = false;
            }
        }
    }
}