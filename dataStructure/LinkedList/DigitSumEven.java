/*21.Write a program which copies contents of source singly linear linked list
whose addition of digits is even number to destination singly linear linked list.*/

class Node{
int data;
Node next;
Node(int data){
this.data=data;
this.next=null;
}
}
class LinkedList{
Node head;

public void addLast( int data){
Node newNode=new Node(data);
if(head==null){
head=newNode;
return;
}
else{
Node temp=head;
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=newNode;
}
}

public void display(){
if(head==null)
{
System.out.println("List is empty");
return;
}
else{
Node temp=head;
while(temp!=null)
{
System.out.print("|"+ temp.data +"->|");
temp=temp.next;
}
return;
}
}

public int digitSum(int num)
{
int sum=0;
while(num!=0)
{
int digit=num%10;
sum=sum+digit;
num=num/10;
}
return sum;
}

public void digitsumeven(LinkedList src)
{

Node temp=src.head;

while(temp!=null){
int sum=digitSum(temp.data);
if(sum%2==0)
{
this.addLast(temp.data);
}
temp=temp.next;

}
}
}
public class DigitSumEven{
    public static void main(String[] args) {
        LinkedList src = new LinkedList();
        LinkedList dest = new LinkedList();

        // Adding elements to source list
        src.addLast(30);
        src.addLast(33);
        src.addLast(73);
        src.addLast(80);
        src.addLast(90);
        src.addLast(100);
        src.addLast(110);

        System.out.print("Source List: ");
        src.display();
         System.out.println();
         System.out.println("----------------------------");
         
        // Copy nodes with even digit sum
        dest.digitsumeven(src);
        
        System.out.println();
          System.out.println("----------------------------");
        System.out.print("Destination List: ");
        dest.display();
    }
}

