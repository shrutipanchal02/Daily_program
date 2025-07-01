class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

public class DoublyCircularLinkedList {
    private Node head = null;
    private Node tail = null;

    // Add at first
    public boolean addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
        return true;
    }

    // Add at last
    public boolean addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = head.prev = head;
        } else {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
        return true;
    }

    // Display forward
    public void display() {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print("|" + temp.data + "| -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Display reverse
    public void displayReverse() {
        if (tail == null) return;

        Node temp = tail;
        do {
            System.out.print("|" + temp.data + "| <=> ");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println();
    }

    // Count nodes
    public int countNodes() {
        if (head == null) return 0;

        int count = 0;
        Node temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    // Insert at specific position
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
        temp.next.prev = newNode;
        temp.next = newNode;

        return true;
    }

    // Delete first
    public boolean deleteFirst() {
        if (head == null) return false;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        return true;
    }

    // Delete last
    public boolean deleteLast() {
        if (head == null) return false;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
        return true;
    }

    // Delete at position
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

    // Search first occurrence
    public int searchFirstOccurrence(int value) {
        if (head == null) return -1;

        Node temp = head;
        int pos = 1;

        do {
            if (temp.data == value) return pos;
            pos++;
            temp = temp.next;
        } while (temp != head);

        return -1;
    }

    // Search all occurrences
    public int searchAllOccurrences(int value) {
        if (head == null) return 0;

        Node temp = head;
        int count = 0;

        do {
            if (temp.data == value) count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        list.addFirst(10);
        list.addFirst(10);
        list.addFirst(10);
        list.display();

        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.display();

        System.out.println("10 occurs " + list.searchAllOccurrences(10) + " times");
        System.out.println("20 occurs at position " + list.searchFirstOccurrence(20));

        list.insertAtPosition(3, 88);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.deleteAtPosition(3);
        list.display();

        list.displayReverse();
    }
}

