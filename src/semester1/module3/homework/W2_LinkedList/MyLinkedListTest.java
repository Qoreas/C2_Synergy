package semester1.module3.homework.W2_LinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {

    @Test
    void addToEnd() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("hi");
        list.add("bye");
        list.add("yoo");
        list.add("abgry");
        System.out.println(list);
    }

    @Test
    void getNodeByIndex() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("hi");
        list.add("bye");
        list.add("yoo");
        list.add("abgry");
        System.out.println(list);
        Assertions.assertEquals(list.getNode(2), "yoo");
    }

    @Test
    void deleteByIndex() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("hi");
        list.add("bye");
        list.add("yoo");
        list.add("angry");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        Assertions.assertEquals(list.getNode(2), "angry");
    }

    @Test
    void deleteHead() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("hi");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }

    @Test
    void deleteHead_ThenNextNodeIsHead() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("hi");
        list.add("bye");
        list.add("yoo");
        list.add("angry");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        Assertions.assertEquals(list.getNode(0), "bye");
    }

    @Test
    void getNode_ThenGetNodeValue() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("hi");
        list.add("bye");
        list.add("yoo");
        list.add("angry");
        System.out.println(list);
        System.out.println(list.getNode(0));
        Assertions.assertEquals(list.getNode(0), "hi");
    }

    @Test
    void deleteLast() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("hi");
        list.add("bye");
        list.add("yoo");
        list.add("angry");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}