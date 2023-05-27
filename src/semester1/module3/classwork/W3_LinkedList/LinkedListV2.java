package semester1.module3.classwork.W3_LinkedList;

public class LinkedListV2<T> {
    private int size;
    private Node head;
    private Node tail;

    public int size() {
        return size;
    }

    private class Node {
        private T value;
        private Node next;
        private Node prev;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value + '}';
        }
    }

    @Override
    public String toString() {
        return "LinkedListV2{" +
                "size=" + size +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }

    public void printNatural() {
        Node current = head;
        System.out.print("List={ ");
        for (int i = 0; i < size; i++) {
            System.out.print(current.toString() + " ");
            current = current.next;
        }
        System.out.println('}');
        System.out.println();
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
    }

    private Node getNode(int index) {
        checkIndex(index);
        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    public T get(int index) {
        return getNode(index).value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public T getLast() {
        if (tail == null) throw new NullPointerException();
        return tail.value;
    }

    public T getFirst() {
        if (head == null) throw new NullPointerException();
        return head.value;
    }

    public void addFirst(T item) {
        Node node;
        if (isEmpty()) {
            node = new Node(item);
            head = node;
            tail = node;
        } else {
            node = new Node(item, head, null);
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void addLast(T item) {
        Node node;
        if (tail == null) {
            node = new Node(item);
            head = node;
        } else {
            node = new Node(item, null, tail);
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public void add(int index, T item) {
        if (index == 0) {
            addFirst(item);
        } else {
            Node node = getNode(index);
            Node newNode = new Node(item, node, node.prev);
            node.prev = newNode;
            newNode.prev.next = newNode;
            size++;
        }
    }

    public void remove(int index) {
        if (size == 1) {
            head = null;
            tail = null;
        } else if (index == 0) {
            head.prev = null;
            head = head.next;
        } else if (index == size - 1) {
            tail.prev.next = null;
            tail = tail.prev;
        } else {
            Node toRemove = getNode(index);
            toRemove.prev.next = toRemove.next;
            toRemove.next.prev = toRemove.prev;
        }
        size--;
    }
}
