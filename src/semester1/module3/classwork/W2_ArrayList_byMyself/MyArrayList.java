package semester1.module3.classwork.W2_ArrayList_byMyself;

public class MyArrayList<E> {
    // add (to end, index), remove, get el (index), change, get size, sort
    // get index, isEmpty
    private E[] array;
    private int size;

    public MyArrayList() {
        array = (E[]) new Object[10];
        size = 0;
    }

    public MyArrayList(int capacity) {
        array = (E[]) new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    private boolean checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        return true;
    }

    public int indexOf(Object toFind) {
        for (int i = 0; i < size; i++) {
            if (toFind.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public void add(E el) {
        if (size >= array.length) {
            E[] bigger = (E[]) new Object[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                bigger[i] = array[i];
            }
            array = bigger;
        }

        array[size] = el;
        size++;
    }

    public void add(E el, int index) {
        if (checkIndex(index)) {
            add(el);

            for (int i = size - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = el;
        }
    }

    public E get(int index) {
        if (!checkIndex(index)) return null;
        return array[index];
    }

    public E remove(int index) {
        E el = get(index);

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        return el;
    }

    public boolean remove(Object obj) {
        int index = indexOf(obj);

        if (index == -1) return false;

        remove(index);
        return true;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }
}
