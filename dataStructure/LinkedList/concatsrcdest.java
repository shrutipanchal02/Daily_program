class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print("|" + current.data + "|");
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static int ConcatFirstN(LinkedList src, LinkedList dest, int no) {
        if (no <= 0) {
            return 0;
        }
        if (src.head == null) {
            return 0;
        }

        Node current = src.head;
        int count = 1;

        while (count < no && current.next != null) {
            current = current.next;
            count++;
        }

        Node segmentHead = src.head;
        Node segmentTail = current;
        Node newSrcHead = segmentTail.next;
        segmentTail.next = null;

        src.head = newSrcHead;

        if (dest.head == null) {
            dest.head = segmentHead;
        } else {
            Node last = dest.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = segmentHead;
        }

        return count;
    }
}

public class concatsrcdest {
    public static void main(String[] args) {
        LinkedList src = new LinkedList();
        src.insert(30);
        src.insert(30);
        src.insert(70);

        LinkedList dest = new LinkedList();
        dest.insert(10);
        dest.insert(20);
        dest.insert(30);
        dest.insert(40);

        System.out.print("Input source linked list: ");
        src.display();
        System.out.print("Input destination linked list: ");
        dest.display();

        int no = 2;
        System.out.println("Input number of elements: " + no);

        int appendedCount = LinkedList.ConcatFirstN(src, dest, no);

        System.out.print("Output destination linked list: ");
        dest.display();
    }
} 
