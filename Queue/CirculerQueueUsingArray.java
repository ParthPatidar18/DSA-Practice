package Queue;

public class CirculerQueueUsingArray {
    private int rear = -1;
    private int front = -1;
    private int size;
    private int[] queue;

    public CirculerQueueUsingArray(int size) {
        this.size = size;
        this.queue = new int[size];
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) { // First element being inserted
            front = 0;
        }
        rear = (rear + 1) % size; // Circular increment
        queue[rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = queue[front]; // Store front element
        if (front == rear) { // Last element removed
            front = rear = -1;
        } else {
            front = (front + 1) % size; // Circular increment
        }
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front]; // ✅ Corrected to return front element
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break; // Stop when reaching rear
            i = (i + 1) % size; // Move in circular manner
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return front == -1; // ✅ Corrected
    }

    public boolean isFull() {
        return (rear + 1) % size == front; // ✅ Correct condition
    }

    public static void main(String[] args) {
        CirculerQueueUsingArray q = new CirculerQueueUsingArray(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(5);

        q.display();
        System.out.println("Peek: " + q.peek());

        System.out.println("Dequeue: " + q.dequeue());
        q.enqueue(8);

        q.display();
    }
}
