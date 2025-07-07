class AddLast{
Node head;
class Node{
String data;
Node next;

Node(String data)
{
this.data=data;
this.next=null;
}
}
public void addFirst(String data){
Node n1=new Node(data);
if(head==null){
head=n1;
return;
}
n1.next=head;
head=n1;
}
public void Print(){
if(head==null){
System.out.println("list is empty");
return;
}
Node curr=head;
while(curr!=null){
System.out.print(curr.data +"->");
curr=curr.next;
}
System.out.println("null");
}

public void addLast(String data){
Node n2=new Node(data);
if(head==null){
head=n2;
return;
}
Node curr=head;
while(curr.next!=null){
curr=curr.next;
}
curr.next=n2;
}
public static void main(String[] args){
AddLast list=new AddLast();
list.addFirst("shruti");
list.addFirst("panchal");

list.Print();
list.addLast("siddhi");
list.Print();
}
}
