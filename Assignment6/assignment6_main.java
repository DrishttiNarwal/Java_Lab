package Assignment6;

public class assignment6_main {
    public static void main(String[] args) {
        Interface_STK stack1 = new assignment6_1(10); // Example usage of assignment6_1
        Interface_STK stack2 = new assignment6_2(20); // Example usage of assignment6_2

        // Push some elements onto stack1
        stack1.push(5);
        stack1.push(10);
        stack1.push(15);

        // Pop elements from stack1
        System.out.println("Popped element from stack1: " + stack1.pop());
        System.out.println("Popped element from stack1: " + stack1.pop());

        // Display stack1 contents
        stack1.displayStack();

        // Push some elements onto stack2
        stack2.push(25);
        stack2.push(30);

        // Pop elements from stack2
        System.out.println("Popped element from stack2: " + stack2.pop());

        // Display stack2 contents
        stack2.displayStack();
    }
}
