package semestr_1.homework.L3;

import java.util.Scanner;

public class T2_BankDeposit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int percent = 7;

        System.out.print("Input deposit value: ");
        double deposit = scan.nextDouble();

        System.out.print("Input months count: ");
        int months = scan.nextInt();

        for (int i = 0; i < months; i++) {
            deposit += deposit / 100 * percent;
        }

        System.out.println("Deposit after " + months + " months: " + deposit);
    }
}