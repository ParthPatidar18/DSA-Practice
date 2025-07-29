public class Reverse_LinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Function to add a node at the front
    void addAtFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //function to reverse a linked list using loop 
    void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node prev = null;
        Node curr = head;
        Node nextNode = null;
    //2-->3-->4
    //3-->2-->4
    //4-->3-->2
        while (curr != null) {
            nextNode = curr.next;//3  //4   //null
            curr.next = prev;//break //break   //2
            prev = curr;//2   //2
            curr = nextNode;//3  //4
        }
        head = prev;
    }
//function to reverse a linked list using recurcively

public Node reverseListByRecursion(Node head){

    if(head==null || head.next==null){
        return head;
    }


    Node newNode=reverseListByRecursion(head.next);
    head.next.next=head;
    head.next=null;
    return newNode;

}
    // Function to print the linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Reverse_LinkedList r1 = new Reverse_LinkedList();
        r1.addAtFront(1);
        r1.addAtFront(7);
        r1.addAtFront(36);
        r1.addAtFront(6);
        r1.addAtFront(036);
        r1.addAtFront(346);

        r1.printList();
        //r1.reverse();
      r1.head=  r1.reverseListByRecursion(r1.head);
        r1.printList();

    }
}