package semester1.module3.classwork.W1_generics;

public class T1_createGeneric {
    public static void main(String[] args) {
        Box<Paper> boxForPaper = new Box<>();
        Box<Plastic> boxForPlastic = new Box<>();
    }
}

class Box<T extends T6_garbage> {
    private T item;

    public void putItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public double getItemWeight() {
        return item == null ? 0 : item.getWeight();
    }
}

class Paper extends T6_garbage {
    @Override
    public double getWeight() {
        return 0.01;
    }
}

class Plastic extends T6_garbage {
    @Override
    public double getWeight() {
        return 0.3;
    }
}
