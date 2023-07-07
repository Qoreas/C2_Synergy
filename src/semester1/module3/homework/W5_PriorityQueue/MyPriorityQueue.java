package semester1.module3.homework.W5_PriorityQueue;

import java.util.Arrays;

public class MyPriorityQueue {
    private int SIZE;
    private int items[];

    private int front, rear;

    public MyPriorityQueue() {
        SIZE = 5;
        items = new int[SIZE];
        front = -1;
        rear = -1;
    }

    public MyPriorityQueue(int SIZE) {
        this.SIZE = SIZE;
        items = new int[SIZE];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    public void enQueue(int element) {
        if (rear == SIZE - 1) {
            System.out.println("Queue full=" + SIZE);
        } else {
            if (isEmpty()) front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Added element=" + element);
        }

        Arrays.sort(items, front, rear);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else return items[front];
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int element = peek();

            if (front == rear) {
                front = -1;
                rear = -1;
            } else front++;

            System.out.println("Deleted=" + element);
            return element;
        }
    }
}
