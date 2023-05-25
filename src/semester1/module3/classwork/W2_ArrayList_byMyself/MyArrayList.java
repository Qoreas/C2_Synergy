package semester1.module3.classwork.W2_ArrayList_byMyself;

import java.util.Arrays;

public class MyArrayList<T> {
    private T[] array;
    private int size = 0;

    public MyArrayList() {
        array = (T[]) new Object[10];
    }

    public MyArrayList(int capacity) {
        array = (T[]) new Object[capacity];
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
    }

    public boolean add(T t) {
        if (size >= array.length) {
            T[] repl = (T[]) new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                repl[i] = array[i];
            }
            array = repl;
        }
        array[size] = t;
        size++;
        return true;
    }

    public void add(int index, T t) {
        checkIndex(index);
        add(t);

        for (int i = size - 1; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = t;
    }

    public T get(int index) {
        checkIndex(index);
        return array[index];
    }

    public T remove(int index) {
        T removedEl = get(index);
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return removedEl;
    }

    public int indexOf(T toFind) {
        for (int i = 0; i < size; i++) {
            if (toFind.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(T t) {
        int index = indexOf(t);
        if (index == -1) return false;
        remove(index);
        return true;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T t) {
        return indexOf(t) != -1;
    }

    public T replace(int index, T t) {
        T repl = get(index);
        remove(index);
        add(index, t);
        return repl;
    }
}
