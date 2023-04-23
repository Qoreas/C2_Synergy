package semester1.module3.classwork.W1_generics;

import java.util.Collection;

public class T5_raw_wildcard {
    static void printCollection(Collection<?> c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }
}