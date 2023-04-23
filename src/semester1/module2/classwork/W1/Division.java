package semester1.module2.classwork.W1;

import java.util.Scanner;

public class Division {
    Scanner sc = new Scanner(System.in);
    private double num1;
    private double num2;

    private void setNum1() {
        this.num1 = sc.nextInt();
    }

    private void setNum2() {
        this.num2 = sc.nextInt();
    }

    private double division() throws ArithmeticException {
        setNum1();
        setNum2();
        if (num2 == 0) throw new ArithmeticException();
        return num1 / num2;
    }

    public void divided() {
        try {
            double result = division();
            System.out.println("a / b = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Try again");
            divided();
        }
    }
}
