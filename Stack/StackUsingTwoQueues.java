import java.util.*;

public class StackUsingTwoQueues {
    static class Stackb {
        static Queue<Integer> s1 = new LinkedList<>();
        static Queue<Integer> s2 = new LinkedList<>();

        // Check if the stack is empty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // Add element (O(n))
        public static void add(int data) {
            // Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.add(s1.remove());
            }

            // Add new element to s1
            s1.add(data);

            // Move all back from s2 to s1
            while (!s2.isEmpty()) {
                s1.add(s2.remove());
            }
        }

        // Remove top element
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return s1.remove();
        }

        // Peek top element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Stackb stack = new Stackb();
        stack.add(1);
        stack.add(3);
        stack.add(5);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.remove();
        }
    }
}
