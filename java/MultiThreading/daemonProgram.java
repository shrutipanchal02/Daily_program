class daemonProgram extends Thread{
public void run()
{
System.out.println(Thread.currentThread().isDaemon());
System.out.println("first thread");
}
public static void main(String[] args){
System.out.println("main");
daemonProgram dp= new daemonProgram();
dp.setDaemon(true);
dp.start();
}
}
