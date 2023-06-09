package semester1.module3.classwork.W5.Queue;

import java.util.LinkedList;
import java.util.List;

public class MyQueue_bad<E> {
    private List<E> queue;
    int front, rear;
    private int size;

    public MyQueue_bad() {
        queue = new LinkedList<>();
        front = -1;
        rear = -1;
        size = 0;
    }

    public void enQueue(E e) {
        if (front == -1) {
            front = 0;
        }
        queue.add(e);
        size++;
    }

    public E peek() {
        return queue.get(0);
    }

    public void pop() {
        queue.remove(0);
    }
}
