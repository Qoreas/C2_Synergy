package semester_3.classwork.W1_generics;

public class T3_interfaces implements GarbageHandle<Paper, PaperHandleMethod>{
    @Override
    public void handle(Paper what, PaperHandleMethod how) {

    }
}

interface GarbageHandle<T, S> {
    void handle(T what, S how);
}

class PaperHandleMethod{}

class PaperHandler<T> implements GarbageHandle<Paper, T> {
    @Override
    public void handle(Paper what, T how) {

    }
}