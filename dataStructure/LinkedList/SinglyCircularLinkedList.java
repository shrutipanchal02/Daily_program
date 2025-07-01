public class SinglyCircularLinkedList {

    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;
    
    public boolean addFirst(int data){
    Node newNode=new Node(data);
    if(head==null && tail==null)
    {
    tail=head=newNode;
    tail.next=head;
    }
    else{
    newNode.next=head;
    head=newNode;
    tail.next=newNode;
    }
    return true;
    }
    
     public boolean addLast(int data){
    Node newNode=new Node(data);
    if(head==null && tail==null)
    {
    tail=head=newNode;
    tail.next=head;
    }
    else{
    tail.next=newNode;
    tail=newNode;
    tail.next=head;
    }
      return true;
  }
      public void display() {
        if (head == null) {
        return;
        }

        Node temp = head;
        do {
            System.out.print("|" + temp.data + "| -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    
    public int countNode(){
int count=0;
     if (head == null) {
        return 0;
  }
  Node cur=head;
  do{ 
  count++;
  cur=cur.next;
  }
  while(cur!=head);
return count;
}

public int searchFirstOccurrence(int data){
int pos=1;
Node cur=head;
if(cur==null)
return -1;

do{
if(cur.data==data)
return pos;
cur=cur.next;
pos++;
}
while(cur!=head);
return -1;
}
 public int searchAllOccurrences(int data) {
 int count=0;
 Node cur=head;
if(cur==null)
return count;
do{
if(cur.data==data)
count++;
cur=cur.next;
}
while(cur!=head);
return count;
}


           public static void main(String[] args)
           {
           scll2 list = new scll2();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.display();

        list.addFirst(10);
        list.display();

        list.addFirst(11);
        list.display();

        list.addFirst(12);
        list.addFirst(13);
        list.display();

        list.addLast(25);
        list.display();
          System.out.println("\nNumber of nodes: " + list.countNode());
          int searchNum = 11;
        System.out.println("Element " + searchNum + " found at position: " + list.searchFirstOccurrence(searchNum));
        searchNum = 10;
        System.out.println("Element " + searchNum + " occurs " + list.searchAllOccurrences(searchNum) + " times");
        }
        }
        


