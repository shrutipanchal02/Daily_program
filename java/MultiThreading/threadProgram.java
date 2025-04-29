class myThread extends Thread{
public void run()
{
System.out.println("first thread");
}
}
class myThread1 extends Thread{
public void run()
{
System.out.println("Second thread");
}
}
class threadProgram{
public static void main(String[] args){
 myThread t= new  myThread();
t.start();
  myThread1 t2=new  myThread1();
t2.start();
}
}

