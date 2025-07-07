class InsertAtPosition{
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
public int countNodes(){
int count=0;
Node curr=head;
while(curr!=null){
count++;
curr=curr.next;
}
return count;
}

 public static void main(String[] args) {
        InsertAtPosition list = new InsertAtPosition();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("e");
        list.addFirst("f");
        System.out.println("---------------------------");
        list.dis(); // f -> e -> b -> a -> Null
    list.insertAtPosition(3,"u");
          list.dis();
            System.out.println("---------------------------");
            }
            }
