package semester1.module3.homework.W2;

public class LinkedListV2<T> {
    private ListItem<T> head;
    private int size;

    private static class ListItem<T> {
        private T data;
        private ListItem<T> next;

        public ListItem(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "ListItem{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public int size() {
        return size;
    }

    private boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    public void add(T t) {
        if (isEmpty()) {
            head = new ListItem<>(t);
        } else {
            ListItem<T> current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = new ListItem<>(t);
        }
        size++;
    }

    public void add(T t, int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        if (isEmpty()) {
            add(t);
        } else {
            ListItem<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            ListItem<T> buffer = current.next.next;
            current.next = new ListItem<>(t);
            current.next.next = buffer;
        }

    }

    public void remove(T t) {
        if (isEmpty()) return;

        if (head.data == t) {
            head = head.next;
            size--;
            return;
        }

        ListItem<T> current = head;
        while (current.next != null) {
            if (current.next.data == t) {
                current.next = current.next.next;
            }
            current = current.next;
        }
        size--;
    }
}
