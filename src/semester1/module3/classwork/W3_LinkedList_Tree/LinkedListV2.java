package semester1.module3.classwork.W3_LinkedList_Tree;

public class LinkedListV2<T> {
    private int size = 0;
    private ListItem<T> head;
    private ListItem<T> tail;

    public int size() {
        return size;
    }

    private static class ListItem<T> {
        private final T data;
        private ListItem<T> next;
        private ListItem<T> prev;

        public ListItem(ListItem<T> prev, T data, ListItem<T> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        public ListItem(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "item{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
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

    public void print() {
        for (int i = 0; i < size - 1; i++) {
            System.out.println("Item=" + getItem(i));
        }
    }

    private ListItem<T> getItem(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        ListItem<T> current;
        if (size / 2 < index) {
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
        ListItem<T> item = getItem(index);
        return item.data;
    }

    public T getLast() {
        if (tail == null) throw new NullPointerException();
        return tail.data;
    }

    public T getFirst() {
        if (head == null) throw new NullPointerException();
        return head.data;
    }

    public void addFirst(T t) {
        if (head == null) {
            ListItem<T> item = new ListItem<>(t);
            head = item;
            tail = item;
        } else {
            ListItem<T> newItem = new ListItem<>(null, t, head);
            head.prev = newItem;
            head = newItem;
        }
        size++;
    }

    public void addLast(T t) {
        if (tail == null) {
            ListItem<T> item = new ListItem<>(t);
            head = item;
            tail = item;
        } else {
            ListItem<T> newItem = new ListItem<>(tail, t, null);
            tail.next = newItem;
            tail = newItem;
        }
        size++;
    }

    public void add(T t, int index) {
        if (head == tail || index == 0) {
            addFirst(t);
        } else {
            ListItem<T> item = getItem(index);
            ListItem<T> newItem = new ListItem<>(item.prev, t, item);
            item.prev = newItem;
            newItem.prev.next = newItem;
            size++;
        }
    }

    public void remove(int index) {
        if (size == 1) {
            head = null;
            tail = null;
        } else if (index == 0) {
            head.next.prev = null;
            head = head.next;
        } else if (index == size - 1) {
            tail.prev.next = null;
            tail = tail.prev;
        } else {
            ListItem<T> item = getItem(index);

            item.prev.next = item.next;
            item.next.prev = item.prev;
        }
        size--;
    }
}
