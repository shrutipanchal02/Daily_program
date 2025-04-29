class test extends Thread{
public void run()
{
System.out.println("first thread");
}
public static void main(String[] args){
test t= new test();
t.start();
}
}
