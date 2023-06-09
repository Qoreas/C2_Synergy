package semester1.module3.classwork.W4_TreeMap.rebuild;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeMapV2Test {

    @Test
    void put() {
        TreeMapV2<Integer, Integer> tree = new TreeMapV2<>();
        tree.put(10, 3);
        tree.put(-10, 44);
        tree.put(30, 2332);
        tree.put(50, 323);
        tree.put(0, 3553);
        tree.put(40, 4224);
        System.out.println(tree.root());
        assertEquals(tree.size(), 6);
    }

    @Test
    void printNatural() {
        TreeMapV2<Integer, Integer> tree = new TreeMapV2<>();
        tree.put(10, 3);
        tree.put(-10, 44);
        tree.put(30, 2332);
        tree.put(50, 323);
        tree.put(0, 3553);
        tree.put(40, 4224);
        tree.printNatural();
    }

    @Test
    void get() {
        TreeMapV2<Integer, Integer> tree = new TreeMapV2<>();
        tree.put(10, 3);
        tree.put(-10, 44);
        tree.put(30, 2332);
        tree.put(50, 323);
        tree.put(0, 3553);
        tree.put(40, 4224);
        assertEquals(tree.get(-10), 44);
        assertNull(tree.get(222));
    }
}