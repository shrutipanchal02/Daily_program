class interruptMethod extends Thread{
public void run()
{
   try{
       for(int i=1;i<=5;i++)
       {  
          System.out.println("child thread  : "+i);
          Thread.sleep(2000);
       }
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
 }
 public static void main(String[] args)throws Exception
 {
interruptMethod im=new interruptMethod();
im.start();
im.interrupt();
}
}
