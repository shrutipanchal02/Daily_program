

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

    // Copy contents of src into this list
    public void copy(LinkedList src, int n) {
        if (n<=0) {
            System.out.println("Source list is empty. Nothing to copy.");
            return;
        }

        Node temp = src.head;
      int count=0;
        while (temp != null && count<n) {
            this.addLast(temp.data);  // destination ला data जोडतो
            temp = temp.next;
            count++;
        }
    }
}

public class CopyListFirst {
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
        dest.copy(src, n);

        System.out.println("Destination list after copying first " + n + " nodes:");
        dest.display();
    }
}
