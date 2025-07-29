package Queue;

public class queueUsingLInkedList {
    private static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = head.data;
        if (head == tail) {
            tail = null;
        }
        head = head.next;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        queueUsingLInkedList q = new queueUsingLInkedList();
        q.enqueue(113);
        q.enqueue(32);
        q.enqueue(45);
        
        q.display();
        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeue: " + q.dequeue());
        q.display();
    }
}