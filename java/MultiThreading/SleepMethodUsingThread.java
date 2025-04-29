class SleepMethodUsingThread extends Thread {
public void run(){
   for(int i=1;i<=10;i++)
   {
       try
         {
          Thread.sleep(2000);
         }
    
        catch(Exception e)
         {  
         System.out.println(e);
         }
      System.out.println(i);
   }
  }
  public static void main(String[] args){
  SleepMethodUsingThread sm=new SleepMethodUsingThread();
  sm.start();
  }
  }
