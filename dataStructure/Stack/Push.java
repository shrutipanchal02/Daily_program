class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Push {
    private Node head;

    // Check if stack is empty
    public boolean isEmpty() {
        return head == null;
    }


    public void push(int data) {
        Node newNode = new Node(data);

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
 public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(" |" + temp.data + "| ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Push p = new Push();

        p.push(10);
        p.push(20);
        p.push(30);
        p.push(40);

        System.out.println("Elements in Stack:");
        p.display();

    }
}
