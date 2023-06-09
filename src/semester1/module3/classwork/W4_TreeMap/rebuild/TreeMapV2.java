package semester1.module3.classwork.W4_TreeMap.rebuild;

public class TreeMapV2<K, V> {
    private int size;
    private Node root;

    private class Node {
        private K key;
        private V value;

        private Node left;
        private Node right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        return size;
    }

    public Node root() {
        return root;
    }

    public V put(K key, V value) {
        if (isEmpty()) {
            root = new Node(key, value);
            size++;
            return null;
        }
        return putRecursive(root, key, value);
    }

    private V putRecursive(Node current, K key, V value) {
        Comparable<? super K> compare = (Comparable<? super K>) key;
        int cmp = compare.compareTo(current.key);
        if (cmp < 0) {
            if (current.left == null) {
                current.left = new Node(key, value);
                size++;
                return null;
            }
            return putRecursive(current.left, key, value);
        }

        if (cmp > 0) {
            if (current.right == null) {
                current.right = new Node(key, value);
                size++;
                return null;
            }
            return putRecursive(current.right, key, value);
        }

        V oldValue = current.value;
        current.value = value;
        return oldValue;
    }

    public void printNatural() {
        printNaturalRecursive(root);
        System.out.println("------------");
    }

    private void printNaturalRecursive(Node current) {
        if (current.left != null) printNaturalRecursive(current.left);
        System.out.println(current.key);
        if (current.right != null) printNaturalRecursive(current.right);
    }

    public V get(Object key) {
        Node node = getNode(key);
        if (node == null) return null;
        return node.value;
    }

    private Node getNode(Object find) {
        Comparable<? super K> compare = (Comparable<? super K>) find;
        Node node = root;
        while (node != null) {
            int cmp = compare.compareTo(node.key);

            if (cmp < 0) node = node.left;
            if (cmp > 0) node = node.right;
            if (cmp == 0) return node;
        }
        return null;
    }

    public V remove(Object key) {
        V oldValue = get(key);
        if (key == root.key) root = removeRecursive(key);
        return oldValue;
    }

    private Node removeRecursive(Object key) {
        Node node = getNode(key);
        Node parent = findParentRecursive(key);

        if (node.left == null && node.right == null) {
            if (node == parent.left) parent.left = null;
            if (node == parent.right) parent.right = null;
            size--;
            return parent;
        }

        if (node.left == null) {
            if (node == parent.left) parent.left = node.right;
            if (node == parent.right) parent.right = node.right;
            size--;
            return parent;
        }

        if (node.right == null) {
            if (node == parent.left) parent.left = node.left;
            if (node == parent.right) parent.right = node.left;
            size--;
            return parent;
        }

        Node tmpNode = findSmallest(node.right);
        removeRecursive(tmpNode.key);
        node.key = tmpNode.key;
        node.value = tmpNode.value;
        return parent;
    }

    private Node findSmallest(Node node) {
        if (node.left == null) return node;
        else return findSmallest(node.left);
    }

    private Node findParentRecursive(Object find) {
        Comparable<? super K> compare = (Comparable<? super K>) find;
        Node node = root;
        Node parent = root;
        while (node != null) {
            int cmp = compare.compareTo(node.key);

            if (cmp < 0) {
                parent = node;
                node = node.left;
            }
            if (cmp > 0) {
                parent = node;
                node = node.right;
            }
            if (cmp == 0) return parent;
        }
        return null;
    }
}
