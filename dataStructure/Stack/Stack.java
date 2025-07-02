class StackNode {
    int data;
    StackNode next;

    public StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Stack {
    private StackNode head;

    // Check if stack is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Push at the end of the stack (bottom-up like in your original logic)
    public void push(int data) {
        StackNode newNode = new StackNode(data);

        if (head == null) {
            head = newNode;
        } else {
            StackNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Pop the last element (top of stack)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        if (head.next == null) {
            int value = head.data;
            head = null;
            return value;
        }

        StackNode temp1 = head;
        StackNode temp2 = null;

        while (temp1.next != null) {
            temp2 = temp1;
            temp1 = temp1.next;
        }

        int value = temp1.data;
        temp2.next = null;
        return value;
    }

    // Display the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        StackNode temp = head;
        while (temp != null) {
            System.out.println(" |" + temp.data + "| ");
            temp = temp.next;
        }
    }
     public int count() {
        int count = 0;
        StackNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }


    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Elements in Stack:");
        stack.display();
          System.out.println("count of the stack: " + stack.count());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
           System.out.println("count of the stack: " + stack.count());

        System.out.println("Elements in Stack:");
        stack.display();
    
        
    }
}
