package Stack;

public class stackUsingArray {
    private int maxSize;
    private  int[] stack;
    private int top;
    public stackUsingArray(int size){
        this.maxSize=size;
        this.stack=new int[maxSize];
        this.top=-1;
    }

    public void push(int data){
    if(isFull(stack)){
        System.out.println("stack is full");
         return;    
    }
    stack[++top]=data;
    }  
    public int pop(){
if(isEmpty()){
    return -1;

}
return stack[top--];
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }
    public boolean isFull(int[] stack){
        return top==maxSize-1;
    }
    
    public boolean isEmpty(){
        return top==-1;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stackUsingArray stack = new stackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();  // Output: 30 20 10

        System.out.println("Popped: " + stack.pop());  // Output: 30
        stack.display();  // Output: 20 10

        System.out.println("Top element: " + stack.peek());  // Output: 20
    }
}
