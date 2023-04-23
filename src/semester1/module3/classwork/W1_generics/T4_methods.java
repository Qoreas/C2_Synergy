package semester1.module3.classwork.W1_generics;

public class T4_methods {
    public <T, S> void handle(T what, S how) {

    }
}

interface Garbage<T, S> {
    void handle(T what, S how);

    <E> void transfer(E dangerousItem);
}