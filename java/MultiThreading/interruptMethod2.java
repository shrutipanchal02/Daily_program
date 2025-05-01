class interruptMethod2 extends Thread{
public void run()
{
  //   System.out.println(Thread.interrupted());
      System.out.println(Thread.currentThread().isInterrupted());
   try{
       for(int i=1;i<=5;i++)
       {  
          System.out.println("child thread  : "+i);
          Thread.sleep(2000);
           System.out.println(Thread.interrupted());
       }
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
 }
 public static void main(String[] args)throws Exception
 {
interruptMethod2 im=new interruptMethod2();
im.start();
im.interrupt();
}
}
