package semester1.module3.classwork.W3_LinkedList_Tree;

import org.junit.jupiter.api.Test;

class LinkedListV2Test {

    @Test
    void add() {
        LinkedListV2<Integer> listV2 = new LinkedListV2<>();
        listV2.addFirst(221);
        listV2.addLast(444);
        listV2.add(100, 0);
        listV2.print();
    }


    @Test
    void remove() {
        LinkedListV2<Integer> listV2 = new LinkedListV2<>();
        listV2.addFirst(221);
        listV2.addLast(444);
        listV2.addFirst(883);
        listV2.addFirst(4323);
        listV2.addFirst(121123);
        listV2.add(100, 0);
        listV2.print();
        System.out.println(listV2.size());

        listV2.remove(1);
        listV2.remove(listV2.size() - 1 );
        listV2.print();
        System.out.println(listV2.size());

    }
}