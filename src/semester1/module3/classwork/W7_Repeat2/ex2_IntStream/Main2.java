package semester1.module3.classwork.W7_Repeat2.ex2_IntStream;

import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {
        IntStream stream = IntStream.range(1, 10);

//        double avg = stream.average().getAsDouble();
//        System.out.println(avg);

        System.out.println(stream.reduce(
                (left, right) -> left * right
        ));
    }
}
