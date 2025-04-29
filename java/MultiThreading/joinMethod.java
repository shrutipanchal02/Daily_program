class joinMethod extends Thread{
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
   joinMethod jm=new joinMethod();
   jm.start();
   jm.join();
   try{
       for(int i=1;i<=5;i++)
       {  
          System.out.println("Main Thread :" +i);
          Thread.sleep(2000);
       }
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
      }
      }
