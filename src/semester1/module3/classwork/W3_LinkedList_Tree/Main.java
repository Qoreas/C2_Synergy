package semester1.module3.classwork.W3_LinkedList_Tree;

public class Main {
    public static void main(String[] args) {
        LinkedListV2<Integer> listV2 = new LinkedListV2<>();
        listV2.addLast(1);
        listV2.addLast(2);
        listV2.addLast(3);
        listV2.addLast(4);
        listV2.addLast(5);

        System.out.println("size = " + listV2.size());

        for (int i = 0; i < listV2.size(); i++) {
            System.out.print(listV2.get(i) + ", ");
        }

        System.out.println("get first = " + listV2.getFirst());
        System.out.println("get last = " + listV2.getLast());

        listV2.addFirst(11);
        for (int i = 0; i < listV2.size(); i++) {
            System.out.print(listV2.get(i) + ", ");
        }
    }
}