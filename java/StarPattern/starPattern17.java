class starPattern17{
public static void main(String[] args)
{
  for(int i = 1; i<6; i++) { 
            for(int j = 1; j<6; j++)
            {
                if(i==j || i+j==6)
                {
                System.out.print("*");
                }else
                {
                 System.out.print(" ");
                }
            }
            System.out.println();
        }
      }
   }
            
