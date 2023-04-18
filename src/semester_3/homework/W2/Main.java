package semester_3.homework.W2;

public class Main {
    public static void main(String[] args) {
        LinkedListV2<String> listV2 = new LinkedListV2<>();
        listV2.add("A");
        listV2.add("B");
        listV2.add("C");
        listV2.add("D");
        listV2.add("E");
        System.out.println(listV2.size());
        System.out.println(listV2);

        listV2.remove("D");
        System.out.println("After remove D = " + listV2);

        listV2.add("F");
        listV2.add("G");
        System.out.println(listV2);

        listV2.add("QW", 3);
        System.out.println(listV2);

        listV2.add("END", 0);
        System.out.println("to end: " + listV2);
    }
}
