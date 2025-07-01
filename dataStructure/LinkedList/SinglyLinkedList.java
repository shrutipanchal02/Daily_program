class SinglyLinkedList{
Node head;
class Node{
String data;
Node next;

Node(String data){
this.data=data;
this.next=null;
}
}
public int addFirst(String data){
Node n1=new Node(data);
if(head==null){
head=n1;
   return 1;
}
n1.next=head;
head=n1;
return 1;
}
public int addLast(String data){
Node n=new Node(data);
if(head==null){
head=n;
return 1;
}
Node curr=head;
while(curr.next!=null){
curr=curr.next;
}
  curr.next = n;
  return 1;
}
public void dis()
{
if(head==null){
System.out.print("list is empty");
return;
}
Node curr=head;
while(curr!=null){
System.out.print(curr.data+"->");
curr=curr.next;
}
System.out.print("Null");
}



public void delete()
{
if(head==null)
{
System.out.print("list is empty");
return;
}
head=head.next;
}

public void deleteLast() {
    if (head == null) {
        System.out.print("list is empty");
        return;
    }


    if (head.next == null) {
        head = null;
        return;
    }

    Node secondlast = null;
    Node last = head;

    while (last.next != null) {
        secondlast = last;
        last = last.next;
    }

    secondlast.next = null;
}



public int countNodes(){
int count=0;
Node curr=head;
while(curr!=null){
count++;
curr=curr.next;
}
return count;
}

public int insertAtPosition(int pos,String data){
if(pos<1||pos>countNodes()+1){
return -1;
}
if(pos==1)
{
return addFirst(data);
}
if(pos==countNodes()+1){
return addLast(data);
}
Node newNode=new Node(data);
Node temp=head;
for(int i=1;i<pos-1;i++){
temp=temp.next;
}
newNode.next=temp.next;
temp.next=newNode;
return 1;
}

 public String get(int index){
if(index<0||index>countNodes()+1){
return null;
}
Node cur=head;
for(int i=0;i<index;i++){
cur=cur.next;
}
return cur.data;
}


    public static void main(String[] args) {
        ll list = new ll();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("e");
        list.addFirst("f");
        System.out.println("---------------------------");
        list.dis(); // f -> e -> b -> a -> Null
 System.out.print("---------------------------");
        list.addLast("c");
        list.dis(); // f -> e -> b -> a -> c -> Null
 System.out.print("---------------------------");
        list.delete();
        list.dis(); // e -> b -> a -> c -> Null
 System.out.print("---------------------------");
        list.deleteLast();
        list.dis(); // e -> b -> a -> Null
 System.out.println("---------------------------");
        System.out.println("\nElements in linked list are: " + list.countNodes());
         System.out.println("---------------------------");
         list.insertAtPosition(3,"u");
          list.dis();
            System.out.println("---------------------------");
        System.out.println("\nElements at index in linked list are: " + list.get(1));
          System.out.println("---------------------------");
      
      
    }
}
