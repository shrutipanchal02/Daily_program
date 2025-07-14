import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ConcatWithRange {
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

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print("|" + temp.data + "|->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Concat nodes from src list from position start to end
    public void concat(ConcatWithRange src, int start, int end) {
        if (start <= 0 || start > end) {
            System.out.println("Invalid range");
            return;
        }

        Node temp = src.head;
        int position = 1;

        // Move to starting position
        while (temp != null && position < start) {
            temp = temp.next;
            position++;
        }

        // Copy data from start to end
        while (temp != null && position <= end) {
            this.addLast(temp.data);
            temp = temp.next;
            position++;
        }
    }
}

public class concatStartEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ConcatWithRange src = new ConcatWithRange();
        ConcatWithRange dest = new ConcatWithRange();

        // Input for source list
        System.out.print("How many elements in source list: ");
        int n = sc.nextInt();
        System.out.println("Enter source list elements:");
        for (int i = 0; i < n; i++) {
            src.addLast(sc.nextInt());
        }

        // Input for destination list
        System.out.print("How many elements in destination list: ");
        int m = sc.nextInt();
        System.out.println("Enter destination list elements:");
        for (int i = 0; i < m; i++) {
            dest.addLast(sc.nextInt());
        }

        // Input for range
        System.out.print("Enter starting range: ");
        int start = sc.nextInt();
        System.out.print("Enter ending range: ");
        int end = sc.nextInt();

        // Perform concatenation
        dest.concat(src, start, end);

        // Display result
        System.out.println("Destination list after concatenation:");
        dest.display();
    }
}

