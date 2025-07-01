class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;

    // Add node at the beginning
    public boolean addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return true;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return true;
    }

    // Add node at the end
    public boolean addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return true;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return true;
    }

    // Display list in forward direction
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print("|" + temp.data + "|-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Count number of nodes
    public int countNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Search first occurrence
    public int searchFirstOccurrence(int data) {
        int pos = 1;
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) return pos;
            temp = temp.next;
            pos++;
        }
        return -1;
    }

    // Search all occurrences
    public int searchAllOccurrences(int data) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) count++;
            temp = temp.next;
        }
        return count;
    }

    // Insert node at given position
    public boolean insertAtPosition(int pos, int data) {
        int size = countNodes();
        if (pos < 1 || pos > size + 1) return false;

        if (pos == 1) return addFirst(data);
        if (pos == size + 1) return addLast(data);

        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) temp.next.prev = newNode;
        temp.next = newNode;

        return true;
    }

    // Delete first node
    public boolean deleteFirst() {
        if (head == null) return false;
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return true;
    }

    // Delete last node
    public boolean deleteLast() {
        if (head == null) return false;
        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev.next = null;
        }
        return true;
    }

    // Delete at specific position
    public boolean deleteAtPosition(int pos) {
        int size = countNodes();
        if (pos < 1 || pos > size) return false;

        if (pos == 1) return deleteFirst();
        if (pos == size) return deleteLast();

        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        return true;
    }

    // Display in reverse order
    public void displayReverse() {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print("|" + temp.data + "|<=>");
            temp = temp.prev;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        list.addFirst(60);
        list.addFirst(70);

        list.display();

        list.addLast(80);
        list.addLast(90);
        list.addLast(10);

        list.display();

        list.insertAtPosition(4, 88);
        list.display();

        System.out.println("20 is occurred " + list.searchAllOccurrences(20) + " times");
        System.out.println("30 is occurred at position " + list.searchFirstOccurrence(30));

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.deleteAtPosition(4);
        list.display();

        System.out.println("Linked list in reverse order is:");
        list.displayReverse();
    }
}

