package semester1.module3.homework.W2_LinkedList;

public class MyLinkedList<T> {
    private Node head;
    private int size;

    public class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public Node head() {
        return head;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    public void add(T item) {
        if (isEmpty()) {
            head = new Node(item);
        } else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = new Node(item);
        }
        size++;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
    }

    public T getNode(int index) {
        checkIndex(index);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public void remove(int index) {
        checkIndex(index);
        if (size == 1) {
            head = null;
        } else if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }

        size--;
    }
}
