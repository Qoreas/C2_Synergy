package semester1.module3.classwork.W4_BinaryTreeMap;

public class MyTreeMap<K, V> {
    private int size;
    private Item root;

    private class Item {
        public K key;
        public V value;
        private Item left;
        private Item right;

        public Item(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public V put(K key, V value) {
        if (root == null) {
            root = new Item(key, value);
            size++;
            return null;
        }
        return putHelper(root, key, value);
    }

    private V putHelper(Item item, K key, V value) {
        Comparable<? super K> k = (Comparable<? super K>) key;
        int cmp = k.compareTo(item.key);

        if (cmp < 0) {
            if (item.left == null) {
                item.left = new Item(key, value);
                size++;
                return null;
            }
            return putHelper(item.left, key, value);
        }

        if (cmp > 0) {
            if (item.right == null) {
                item.right = new Item(key, value);
                size++;
                return null;
            }
            return putHelper(item.right, key, value);
        }

        V oldVal = item.value;
        item.value = value;
        return oldVal;
    }

    public V get(Object key) {
        Item item = findItem(key);
        if (item == null) return null;
        return item.value;
    }

    private Item findItem(Object target) {
        Comparable<? super K> k = (Comparable<? super K>) target;
        Item item = root;
        while (item != null) {
            int cmp = k.compareTo(item.key);
            if (cmp < 0) item = item.left;

            if (cmp > 0) item = item.right;

            if (cmp == 0) return item;
        }
        return null;
    }

    public V remove(Object key) {
        V oldValue = get(key);
        if (key == root.key) root = delRec(key);
        return oldValue;
    }

    private Item findParent(Object target) {
        Comparable<? super K> k = (Comparable<? super K>) target;
        Item item = root;
        Item parent = root;
        while (item != null) {
            int cmp = k.compareTo(item.key);
            if (cmp < 0) {
                parent = item;
                item = item.left;
            }

            if (cmp > 0) {
                parent = item;
                item = item.right;
            }

            if (cmp == 0) return parent;
        }
        return null;
    }

    private Item delRec(Object key) {
        Item item = findItem(key);
        Item parent = findParent(key);

        if (item.left == null && item.right == null) {
            if (item == parent.left) parent.left = null;
            if (item == parent.right) parent.right = null;
        }

        if (item.right == null) {
            if (item == parent.left) parent.left = item.left;
            if (item == parent.right) parent.right = item.left;
            size--;
            return parent;
        }

        if (item.left == null) {
            if (item == parent.left) parent.left = item.right;
            if (item == parent.right) parent.right = item.right;
            size--;
            return parent;
        }

        Item tmpItem = findSmallest(item.right);
        delRec(tmpItem);
        item.key = tmpItem.key;
        item.value = tmpItem.value;
        return parent;
    }

    private Item findSmallest(Item item) {
        if (item.left == null) return item;
        return findSmallest(item.left);
    }

    public void printKeys() {
        LER_keys(root);
        System.out.println("_______");
    }

    public void printValues() {
        LER_values(root);
        System.out.println("_______");
    }

    private void LER_keys(Item item) {
        if (item.left != null) LER_keys(item.left);
        System.out.println(item.key);
        if (item.right != null) LER_keys(item.right);
    }

    private void LER_values(Item item) {
        if (item.left != null) LER_values(item.left);
        System.out.println(item.value);
        if (item.right != null) LER_values(item.right);
    }
}