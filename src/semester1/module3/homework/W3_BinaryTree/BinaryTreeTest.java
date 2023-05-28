package semester1.module3.homework.W3_BinaryTree;

import org.junit.jupiter.api.Test;
import semester1.module3.homework.W3_BinaryTree.BinaryTree;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void add() {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
    }

    @Test
    void creatingTree_WhenAddingItems_ThenCheckItemsContains() {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));
        assertFalse(bt.containsNode(-1));
    }

    @Test
    void deleteItem() {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        assertTrue(bt.containsNode(3));
        bt.delete(3);
        assertFalse(bt.containsNode(3));
    }

    @Test
    void printInOrder() {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.traverseInOrder(bt.root());
    }
}