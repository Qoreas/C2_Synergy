package semester1.module3.classwork.W5.Queue;

public class MyQueue {
    int SIZE = 5;
    int[] items = new int[SIZE];
    int front, rear;

    public MyQueue() {
        front = -1;
        rear = -1;
    }

    public void enQueue(int element) {
        if (rear == SIZE - 1) {
            System.out.println("Queue is full.");

        } else {
            if (front == -1) front = 0;

            rear++;
            items[rear] = element;
            System.out.println("Element is added " + element);
        }
    }

    public int pop() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            int element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;

            } else front++;

            System.out.println("Element removed " + element);
            return element;
        }
    }

    public int peak() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return -1;
        } else return items[front];
    }
}
