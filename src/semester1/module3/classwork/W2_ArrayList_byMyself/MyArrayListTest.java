package semester1.module3.classwork.W2_ArrayList_byMyself;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyArrayListTest {

    @Test
    void addToEnd() {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }
        System.out.println(list);

        Assertions.assertEquals(list.size(), 3);
    }

    @Test
    void getByIndex() {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add(i);
        }
        System.out.println(list);

        Assertions.assertEquals(list.get(3), 3);
    }

    @Test
    void addToIndex() {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add(i);
        }
        System.out.println(list);

        list.add(3, 100);
        System.out.println(list);

        Assertions.assertEquals(list.get(3), 100);
    }

    @Test
    void removeItemByIndex() {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add(i);
        }
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
        Assertions.assertNull(list.get(6));
    }

    @Test
    void removeItemByObject() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("hi");
        list.add("yet");
        list.add("bye");
        System.out.println(list);

        list.remove("yet");
        System.out.println(list);
        Assertions.assertEquals(list.get(1), "bye");
    }

    @Test
    void isContains() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("hi");
        list.add("yet");
        list.add("bye");
        System.out.println(list);

        Assertions.assertTrue(list.contains("hi"));
        Assertions.assertFalse(list.contains("1"));
    }

    @Test
    void BeforeArrayEmpty_ThenArrayHaveElements() {
        MyArrayList<String> list = new MyArrayList<>();
        System.out.println(list);
        Assertions.assertTrue(list.isEmpty());

        list.add("hi");
        list.add("yet");
        list.add("bye");
        System.out.println(list);
        Assertions.assertFalse(list.isEmpty());
    }

    @Test
    void replaceItem() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("hi");
        list.add("yet");
        list.add("bye");
        System.out.println(list);
        Assertions.assertEquals(list.get(0), "hi");

        list.replace(0, "QWERTY");
        System.out.println(list);
        Assertions.assertEquals(list.get(0), "QWERTY");
    }
}