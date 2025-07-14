/*23.Write a program which accept source singly linear linked list and destination
singly linear linked list and check whether source list is sub list of destination
list. Function returns first position at which sub list found.*/


import java.util.Scanner;

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

    // Method to check if source is sublist of destination
    public int subCompare(LinkedList src, LinkedList dest) {
        Node desttemp = dest.head;
        int pos = 1;

        while (desttemp != null) {
            Node dtemp = desttemp;
            Node stemp = src.head;

            while (dtemp != null && stemp != null && dtemp.data == stemp.data) {
                dtemp = dtemp.next;
                stemp = stemp.next;
            }

            if (stemp == null) {
                return pos; // full source matched
            }

            desttemp = desttemp.next;
            pos++;
        }

        return -1; // no match found
    }
}

// Main class
public class CompareSubList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList dest = new LinkedList();
        LinkedList src = new LinkedList();

        System.out.println("Enter how many elements for Destination List:");
        int destC = sc.nextInt();
        System.out.println("Enter elements for Destination List:");
        for (int i = 0; i < destC; i++) {
            dest.addLast(sc.nextInt());
        }

        System.out.println("Enter how many elements for Source List:");
        int srcC = sc.nextInt();
        System.out.println("Enter elements for Source List:");
        for (int i = 0; i < srcC; i++) {
            src.addLast(sc.nextInt());
        }

        // Display lists
        System.out.println("\nDestination List:");
        dest.display();

        System.out.println("Source List:");
        src.display();

        // Call method from dest object
        int position = dest.subCompare(src, dest);

        if (position != -1)
            System.out.println("✅ Sublist found at position: " + position);
        else
            System.out.println("❌ Sublist not found.");
    }
}

