class AddFirst{
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

public static void main(String[] args){
AddFirst list=new AddFirst();
list.addFirst("shruti");
list.addFirst("panchal");

list.Print();
}
}
