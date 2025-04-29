class joinMethod2 extends Thread{
  static Thread mainthread;
public void run()
{

   try{
       mainthread.join();
       for(int i=1;i<=5;i++)
       {  
          System.out.println("child thread  : "+i);
          Thread.sleep(1000);
       }
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
 }
 public static void main(String[] args)throws Exception
 {
   mainthread=Thread.currentThread();
   joinMethod2 jm=new joinMethod2();
   jm.start();
  
   try{
       for(int i=1;i<=5;i++)
       {  
          System.out.println("Main Thread :" +i);
          Thread.sleep(1000);
       }
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
      }
      }
