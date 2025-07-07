public class ConcatLinkedList {

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void concat(ConcatLinkedList other) {
        if (this.head == null) {
            this.head = other.head;
            return;
        }

        if (other.head == null) return;

        Node temp = this.head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = other.head;
    }

    public static void main(String[] args) {
        ConcatLinkedList firstList = new ConcatLinkedList();
        ConcatLinkedList secondList = new ConcatLinkedList();

        secondList.addLast(30);
        secondList.addLast(30);
        secondList.addLast(70);

        firstList.addLast(10);
        firstList.addLast(20);
        firstList.addLast(30);
        firstList.addLast(40);

        System.out.println("First List:");
        firstList.printList();

        System.out.println("Second List:");
        secondList.printList();

        firstList.concat(secondList);

        System.out.println("After Concatenation:");
        firstList.printList();
    }
}

