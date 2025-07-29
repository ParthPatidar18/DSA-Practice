package Stack;

 class StackUsingLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        private Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public int pop() {
            if (isEmpty()) {
                return -1; // Stack is empty
            }
            int top = head.data;
            head = head.next;
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(23);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}