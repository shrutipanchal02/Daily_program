class SleepMethodWithMultipleThread extends Thread{
public void run()
{
   try
   {
      for(int i=1;i<=10;i++)
      {
      
        System.out.println(i +"  " +Thread.currentThread().getName());
          Thread.sleep(2000);
      }
   }
   catch(Exception e)
   {  
     System.out.println(e);
   }
   }
   public static void main(String[] args)
   {
   SleepMethodWithMultipleThread st=new SleepMethodWithMultipleThread();
   st.start();
   SleepMethodWithMultipleThread st2=new SleepMethodWithMultipleThread();
   st2.start();
   } 
   }
