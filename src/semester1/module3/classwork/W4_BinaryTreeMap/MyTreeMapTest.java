package semester1.module3.classwork.W4_BinaryTreeMap;

import org.junit.jupiter.api.Test;

class MyTreeMapTest {

    MyTreeMap<Integer, Integer> create() {
        MyTreeMap<Integer, Integer> tree = new MyTreeMap<>();
        tree.put(40, 1);
        tree.put(20, 2);
        tree.put(60, 3);
        tree.put(30, 4);
        tree.put(50, 5);
        tree.put(70, 6);
        tree.put(5, 7);
        tree.put(55, 8);
        tree.put(155, 8);
        tree.put(100, 8);
        tree.put(120, 8);
        tree.put(170, 8);
        return tree;
    }

    @Test
    void putPrintKeys() {
        MyTreeMap<Integer, Integer> treeMap = create();
        treeMap.printKeys();
    }

    @Test
    void removeItemFull() {
        MyTreeMap<Integer, Integer> treeMap = create();
        treeMap.printKeys();
        treeMap.remove(100);
        treeMap.printKeys();
    }
}