package semester1.module3.classwork.W5.Queue;

public class MyQueue_2 {
    private int SIZE;
    private int items[] = new int[SIZE];

    private int front, rear;

    public MyQueue_2() {
        SIZE = 5;
        front = -1;
        rear = -1;
    }

    public MyQueue_2(int SIZE) {
        this.SIZE = SIZE;
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
