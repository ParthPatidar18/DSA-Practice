// Define the Linked List class
class Single_LinkedList {
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head; // Added head as a member of the class

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
      // Function to add a node at the last
      void addAtLast(int data){
          Node newNode= new Node(data);
           if (head == null) {
            head = newNode;
            return;
        }
           Node temp = head;
        while (temp.next != null) {
           
            temp = temp.next;
        }
          temp.next=newNode;
      }   
      // Function to delete a node at the front 
      void deleteFromFront(){
           if (head == null) {
            
            System.out.print("List is empty");
            return;
        }
          Node temp=head;
          head=head.next;
      }
      // Function to delete a node at the last 
      void deleteFromLast(){
           if (head == null) {
            
            System.out.print("List is empty");
            return;
        } 
        Node temp=head.next;
        Node stemp=head;
        
        while(temp.next!=null){
            stemp=stemp.next;
            temp=temp.next;
        }
        stemp.next=null;
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
        System.out.println("Try programiz.pro");

        Single_LinkedList linkedList = new Single_LinkedList(); // Corrected instantiation
        linkedList.addAtFront(12);
        linkedList.addAtFront(24);
        linkedList.addAtFront(36);
        linkedList.addAtLast(40);
        linkedList.addAtLast(45);
        
        linkedList.printList(); // Display the linked list
        
        linkedList.deleteFromFront();
        linkedList.deleteFromFront();
        linkedList.deleteFromLast();
        linkedList.deleteFromLast();
        linkedList.printList(); // Display the linked list
    }
}
