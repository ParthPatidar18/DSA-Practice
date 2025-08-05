import java.util.Deque;
import java.util.ArrayDeque;

class MyStack {
    private Deque<Integer> deque;

    public MyStack() {
        deque = new ArrayDeque<>();
    }

    // Push element onto stack
    public void push(int x) {
        deque.addFirst(x);  // or deque.push(x);
    }

    // Removes the element on top of the stack and returns it
    public int pop() {
        if (deque.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return deque.removeFirst();  // or deque.pop();
    }

    // Get the top element
    public int top() {
        if (deque.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return deque.peekFirst();  // or deque.peek();
    }

    // Returns whether the stack is empty
    public boolean empty() {
        return deque.isEmpty();
    }
}
public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(5);
        stack.push(10);
        System.out.println(stack.top());    // 10
        System.out.println(stack.pop());    // 10
        System.out.println(stack.empty());  // false
    }
}
