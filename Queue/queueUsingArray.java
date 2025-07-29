package Queue;

public class queueUsingArray {
    private int rear = -1;
    private int front = 0;
    private int size;
    private int[] queue;
    
    public queueUsingArray(int size) {
        this.size = size;
        this.queue = new int[size];
    }
    
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;    
        }
        queue[++rear] = data;
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = queue[front]; // Store the front element
        front++; // Move front pointer to the next element
    
        // Reset front and rear if the queue becomes empty
        if (front > rear) {
            front = rear = -1;
        }
        
        return data;
    }
    
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    
    public boolean isEmpty() {
        return rear == -1;
    }
    
    public boolean isFull() {
        return rear == size - 1;
    }
    
    public static void main(String[] args) {
        queueUsingArray q = new queueUsingArray(5);
        q.enqueue(113);
        q.enqueue(32);
        q.enqueue(45);
        
        q.display();
        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeue: " + q.dequeue());
        q.display();
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());
    }
}