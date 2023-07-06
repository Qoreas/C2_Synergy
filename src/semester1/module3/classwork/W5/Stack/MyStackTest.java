package semester1.module3.classwork.W5.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyStackTest {

    @Test
    MyStack createStack() {
        MyStack stack = new MyStack();
        assertEquals(stack.CAPACITY(), 5);
        return stack;
    }

    @Test
    void push_InCapacity() {
        MyStack stack = createStack();
        stack.push(2);
        stack.push(121);
        stack.push(5);
        stack.push(3);
        stack.push(444);
    }

    @Test
    void push_OutOfCapacity() throws ArrayIndexOutOfBoundsException {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            MyStack stack = createStack();
            stack.push(2);
            stack.push(121);
            stack.push(5);
            stack.push(3);
            stack.push(444);
            stack.push(2);
        });
    }

    @Test
    void pop_peek_StackHaveElements() throws ArrayIndexOutOfBoundsException {
        MyStack stack = createStack();
        stack.push(2);
        stack.push(121);
        stack.push(5);
        stack.push(3);
        stack.push(444);

        stack.pop();
        assertEquals(stack.peek(), 3);
    }

    @Test
    void pop_peek_StackHaveOneElement() throws ArrayIndexOutOfBoundsException {
        MyStack stack = createStack();
        stack.push(44);
        assertEquals(stack.peek(), 44);
        stack.pop();
        assertEquals(stack.peek(), -1);

    }
}