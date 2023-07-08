package semester1.module3.classwork.W6_Repeat.Consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<GrandFather> gfConsumer = gf -> gf.gfMethod();
        Consumer<Father> fConsumer = f -> f.fMethod();
        Consumer<Son> sConsumer = s -> s.sMethod();

        Consumer<Father> multiConsumer = fConsumer.andThen(gfConsumer);

        Father father = new Father();
        multiConsumer.accept(father);
    }
}
