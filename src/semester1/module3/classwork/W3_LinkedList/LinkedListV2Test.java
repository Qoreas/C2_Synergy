package semester1.module3.classwork.W3_LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListV2Test {

    @Test
    void addLast_getLast() {
        LinkedListV2<String> listV2 = new LinkedListV2<>();
        listV2.addLast("hi");
        listV2.addLast("bye");
        listV2.addLast("yee");
        listV2.printNatural();
        assertEquals(listV2.getLast(), "yee");
    }

    @Test
    void addLast_getFirst() {
        LinkedListV2<String> listV2 = new LinkedListV2<>();
        listV2.addLast("hi");
        listV2.addLast("bye");
        listV2.addLast("yee");
        listV2.printNatural();
        assertEquals(listV2.getFirst(), "hi");
    }

    @Test
    void getByIndex_SecondElement() {
        LinkedListV2<String> listV2 = new LinkedListV2<>();
        listV2.addLast("hi");
        listV2.addLast("bye");
        listV2.addLast("yee");
        listV2.printNatural();
        assertEquals(listV2.get(1), "bye");
    }

    @Test
    void addFirst_getFirst() {
        LinkedListV2<String> listV2 = new LinkedListV2<>();
        listV2.addLast("hi");
        listV2.addLast("bye");
        listV2.addLast("yee");
        listV2.addFirst("YYY");
        listV2.printNatural();
        assertEquals(listV2.getFirst(), "YYY");
    }

    @Test
    void addByIndex_ListHaveItems() {
        LinkedListV2<String> listV2 = new LinkedListV2<>();
        listV2.addLast("hi");
        listV2.addLast("bye");
        listV2.addLast("yee");
        listV2.add(1, "QWE");
        listV2.printNatural();
        assertEquals(listV2.get(1), "QWE");
    }

    @Test
    void add_ListNotHaveItems() {
        LinkedListV2<String> listV2 = new LinkedListV2<>();
        listV2.add(0, "QWE");
        listV2.printNatural();
        assertEquals(listV2.getFirst(), "QWE");
    }

    @Test
    void removeOnlyItem_ThenSizeIsZero() {
        LinkedListV2<String> listV2 = new LinkedListV2<>();
        listV2.add(0, "QWE");
        listV2.printNatural();
        listV2.remove(0);
        listV2.printNatural();
        assertEquals(listV2.size(), 0);
    }

    @Test
    void removeLastItem() {
        LinkedListV2<String> listV2 = new LinkedListV2<>();
        listV2.addLast("bye");
        listV2.addLast("yee");
        listV2.addFirst("QWE");
        listV2.addFirst("eee");
        listV2.addFirst("lpl");
        listV2.addLast("www");

        listV2.printNatural();
        listV2.remove(listV2.size() - 1);
        listV2.printNatural();
        assertEquals(listV2.getLast(), "yee");
    }
}