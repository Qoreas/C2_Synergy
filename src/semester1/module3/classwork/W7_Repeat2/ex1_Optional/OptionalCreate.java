package semester1.module3.classwork.W7_Repeat2.ex1_Optional;

import java.util.Optional;

public class OptionalCreate {
    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        String test = "ffff";
        Optional<String> stringOptional = Optional.of(test);
        System.out.println(stringOptional);

        String nullString = null;
        Optional<String> nullOptional = Optional.ofNullable(nullString);
        System.out.println(nullOptional);
    }
}
