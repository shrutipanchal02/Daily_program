class ThreadName{
public static void main(String[] args){
System.out.println("hello");
System.out.println(Thread.currentThread().getName());
Thread.currentThread().setName("abc");
System.out.println(Thread.currentThread().getName());
}
}
