

/*16.Write a program which copies contents of source singly linear linked list to
singly linear destination linked list.*/
// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
class LinkedList {
    Node head;

    // Add node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print("|" + temp.data + "|->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
    public int count(){
    if(head==null)
    {
    System.out.println("empty");
    return 0;
}
int count=0;
Node temp=head;
while(temp!=null){
count++;
temp=temp.next;
}
return count;
}
    // Copy contents of src into this list
    public void copyLast(LinkedList src, int n) {
    int size=src.count();
        if (n<=0 && n>size) {
            System.out.println("Source list is empty. Nothing to copy.");
            return;
        }
         int pos=1;
        Node temp = src.head;
        int start=size-n+1;
     
        while (temp != null && pos<start) {
            temp = temp.next;
            pos++;
        }
        while(temp!=null)
        {
        this.addLast(temp.data);
        temp=temp.next;
    }
}
}

public class CopyListLast {
    public static void main(String[] args) {
        LinkedList src = new LinkedList();
        LinkedList dest = new LinkedList();

        // Source list elements (manually added)
        src.addLast(30);
        src.addLast(30);
        src.addLast(70);
        src.addLast(80);
        src.addLast(90);
        src.addLast(100);

        // N value to copy
        int n = 4;

        System.out.println("Source list:");
        src.display();

        System.out.println("Destination list before copy:");
        dest.display();

        // Copy first N nodes from src to dest
        dest.copyLast(src, n);

        System.out.println("Destination list after copying first " + n + " nodes:");
        dest.display();
    }
}
