

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
    public void copy(LinkedList src) {
        if (src.head == null) {
            System.out.println("Source list is empty. Nothing to copy.");
            return;
        }

        Node temp = src.head;

        while (temp != null) {
            this.addLast(temp.data);  // destination ला data जोडतो
            temp = temp.next;
        }
    }
}

// Main class
public class CopyList {
    public static void main(String[] args) {

        LinkedList src = new LinkedList();
        LinkedList dest = new LinkedList();

        // 🔹 Source list elements manually add करूया
        src.addLast(30);
        src.addLast(30);
        src.addLast(70);
        src.addLast(80);
        src.addLast(90);
        src.addLast(100);

        // 🔹 Destination list empty आहे
        System.out.println("Destination list before copy:");
        dest.display();

  
        dest.copy(src);

        // 🔹 Final output
        System.out.println("Destination list after copy:");
        dest.display();
    }
}

