package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SScan {
    public static String getString() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input sentence: ");
        return scan.nextLine();
    }

    public static int getInt() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number (int): ");
        int result = 0;

        try {
            result = scan.nextInt();
        } catch (InputMismatchException exception) {
            System.out.print("You input wrong symbol: ");
        }
        return result;
    }

    public static double getDouble() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number (double): ");
        double result = 0D;

        try {
            result = scan.nextDouble();
        } catch (InputMismatchException exception) {
            System.out.print("You input wrong symbol: ");
        }
        return result;
    }
}