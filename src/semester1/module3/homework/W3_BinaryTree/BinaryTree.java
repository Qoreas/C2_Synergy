package semester1.module3.homework.W3_BinaryTree;

public class BinaryTree {
    private Node root;

    private class Node {
        private int value;
        private Node right;
        private Node left;

        public Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }

        public Node(int value, Node right, Node left) {
            this.value = value;
            this.right = right;
            this.left = left;
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node root() {
        return root;
    }

    private boolean isCurrentNull(Node current) {
        return current == null;
    }

    private Node addRecursive(Node current, int item) {
        if (isCurrentNull(current)) {
            return new Node(item);
        }

        if (item < current.value) {
            current.left = addRecursive(current.left, item);
        } else if (item > current.value) {
            current.right = addRecursive(current.right, item);
        } else {
            return current;
        }
        return current;
    }

    public void add(int item) {
        root = addRecursive(root, item);
    }

    private boolean containsNodeRecursive(Node current, int item) {
        if (isCurrentNull(current)) return false;
        if (item == current.value) return true;

        return item < current.value
                ? containsNodeRecursive(current.left, item)
                : containsNodeRecursive(current.right, item);

    }

    public boolean containsNode(int item) {
        return containsNodeRecursive(root, item);
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    private Node deleteRecursive(Node current, int item) {
        if (isCurrentNull(current)) return null;

        if (item == current.value) {
            if (current.left == null && current.right == null) return null;

            if (current.right == null) return current.left;
            if (current.left == null) return current.right;

            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }

        if (item < current.value) {
            current.left = deleteRecursive(current.left, item);
            return current;
        }
        current.left = deleteRecursive(current.left, item);
        return current;
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
}
