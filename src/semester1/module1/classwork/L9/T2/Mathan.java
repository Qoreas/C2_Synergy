package semester1.module1.classwork.L9.T2;

class Sum {
}

public class Mathan {

    static int sum(int x, int y) {
        return x + y;
    }

    static String printResult() {
        return "Result: ";
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 11;

        String result = printResult() + sum(6, 3);

        System.out.println(result);
    }
}
