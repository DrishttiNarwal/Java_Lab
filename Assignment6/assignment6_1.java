package Assignment6;

public class assignment6_1 implements Interface_STK {
    private int[] stack;
    private int top;
    private final int capacity;

    public assignment6_1(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    @Override
    public boolean isUnderFlow() {
        return top == -1;
    }

    @Override
    public boolean isOverFlow() {
        return top == capacity - 1;
    }

    @Override
    public void push(int element) {
        if (!isOverFlow()) {
            stack[++top] = element;
        } else {
            System.out.println("Stack overflow! Cannot push " + element + ".");
        }
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
}
