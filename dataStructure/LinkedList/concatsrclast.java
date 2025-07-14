
//Write a program which accepts two singly linear linked list from user and
//concat last N elements of source linked list after destination linked list.

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;

    // शेवटी node टाका
    void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Total nodes count
    public int count() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // List display करा
    public void display() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print("|" + temp.data + "|->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // शेवटचे N nodes पासून सुरू होणारा node शोधा
    Node srcLastFind(int n) {
        int total = count();
        int skip = total - n;
        Node temp = head;
        for (int i = 0; i < skip; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // source चे शेवटचे n nodes destination ला जोडा
    public void concatLastsrcnode(LinkedList src, int n) {
        if (src.head == null || n <= 0 || n > src.count()) {
            System.out.println("invalid");
            return;
        }

        Node lastnnode = src.srcLastFind(n);

        if (this.head == null) {
            this.head = lastnnode;
        } else {
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = lastnnode;
        }
    }
}

public class concatsrclast{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList src = new LinkedList();
        LinkedList dest = new LinkedList();

        System.out.print("how many elements you want for source: ");
        int Scount = sc.nextInt();
        System.out.println("Enter elements for source list:");
        for (int i = 0; i < Scount; i++) {
            src.addLast(sc.nextInt());
        }

        System.out.print("how many elements you want for destination: ");
        int Dcount = sc.nextInt();
        System.out.println("Enter elements for destination list:");
        for (int i = 0; i < Dcount; i++) {
            dest.addLast(sc.nextInt());
        }

        System.out.print("Source list मधून शेवटचे किती elements जोडायचे आहेत? ");
        int n = sc.nextInt();

        // Concat operation
        dest.concatLastsrcnode(src, n);

        // Final display
        System.out.println("Concat नंतरची Destination list:");
        dest.display();
    }
} 
