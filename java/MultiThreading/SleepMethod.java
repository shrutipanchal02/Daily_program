class SleepMethod {
public static void main(String[] args)
{
   try
   {
      for(int i=1;i<=10;i++)
      {
      
        System.out.println(i);
          Thread.sleep(2000);
      }
   }
   catch(Exception e)
   {  
     System.out.println(e);
   }
   }
   }
