package HomeWork.L4;

import java.util.Random;

public class T3_RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int numbers = 30;

        for (int i = 0; i <= numbers; i += 2) {
            int rNum = random.nextInt(1, 100);

            if (rNum % 2 == 0) {
                System.out.println(rNum);
            }
        }
    }
}
