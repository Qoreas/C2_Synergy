package semester1.module1.homework.L1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dt {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.format(formatter));
    }
}
