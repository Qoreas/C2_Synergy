package semester1.module3.classwork.W5.Queue;

import java.util.LinkedList;
import java.util.List;

public class MyQueue<E> {
    private List<E> queue;
    private int size;
    private int front, rear;

    MyQueue() {
        queue = new LinkedList<>();
        size = 0;
        rear = -1;
        front = -1;
    }

    public void enQueue(E e) {
        if (front == -1) front = 0;

        queue.add(e);
        size++;
    }

    public E peek() {
        return queue.get(0);
    }

    public void pop() {
        queue.remove(0);
        size--;
    }
}
