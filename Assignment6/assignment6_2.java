package Assignment6;

public class assignment6_2 implements Interface_STK {
    private int[] stack;
    private int top;
    private int capacity;

    public assignment6_2(int initialCapacity) {
        this.capacity = initialCapacity;
        this.stack = new int[initialCapacity];
        this.top = -1;
    }

    @Override
    public boolean isUnderFlow() {
        return top == -1;
    }

    @Override
    public boolean isOverFlow() {
        return false; // Growable stack never overflows
    }

    @Override
    public void push(int element) {
        if (top == capacity - 1) {
            grow();
        }
        stack[++top] = element;
    }

    @Override
    public int pop() {
        if (!isUnderFlow()) {
            return stack[top--];
        } else {
            System.out.println("Stack underflow! Cannot pop from an empty stack.");
            return -1;
        }
    }

    @Override
    public void displayStack() {
        if (!isUnderFlow()) {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        } else {
            System.out.println("Stack is empty.");
        }
    }

    private void grow() {
        capacity *= 2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }
}
