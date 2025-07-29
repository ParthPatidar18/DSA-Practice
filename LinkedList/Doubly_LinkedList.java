public class Doubly_LinkedList {
    class Node {
        int value;
        Node next, prev;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    // Add to the front
    public void addFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add to the end
    public void addLast(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Remove from the front
    public void removeFront() {
        if (head == null) {
            System.out.println("List is empty. Nothing to remove at front.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Remove from the end
    public void removeEnd() {
        if (tail == null) {
            System.out.println("List is empty. Nothing to remove at end.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Print list from front to back
    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Doubly_LinkedList list = new Doubly_LinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addLast(5);
        list.addLast(1);

        list.printForward();  // 20 10 5 1

        list.removeFront();
        list.printForward();  // 10 5 1

        list.removeEnd();
        list.printForward();  // 10 5
    }
}
