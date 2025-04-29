class test2 extends Thread{
public void run()
{
System.out.println("first thread");
}
public static void main(String[] args){
test2 t= new test2();
t.start();
test2 t2=new test2();
t2.start();
}
}
