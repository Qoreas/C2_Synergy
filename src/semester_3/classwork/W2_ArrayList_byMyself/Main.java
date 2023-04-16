package semester_3.classwork.W2_ArrayList_byMyself;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.print();

        list.remove(0);
        list.print();

    }
}
