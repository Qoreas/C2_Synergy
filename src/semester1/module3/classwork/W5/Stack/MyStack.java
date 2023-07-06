package semester1.module3.classwork.W5.Stack;

public class MyStack {
    private int CAPACITY;
    private int stack[];
    private int top = -1;

    public MyStack(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        stack = new int[CAPACITY];
    }

    public MyStack() {
        CAPACITY = 5;
        stack = new int[CAPACITY];
    }

    public int CAPACITY() {
        return CAPACITY;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int element) {
        if (top - 1 == CAPACITY) {
            throw new StackOverflowError();
        }

        top++;
        stack[top] = element;
        System.out.println("Added=" + element);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }
}
