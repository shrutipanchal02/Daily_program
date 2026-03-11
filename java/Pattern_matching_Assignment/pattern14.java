class pattern14{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=4;i++)
{
  for(int j=1;j<=4;j++)
  {
     if(i==1|| i==4 || j==1 || j==4)
  {
   System.out.print(num+"  ");
  }
  else
  {
   System.out.print("0  ");
  }
  num++;
  }
  System.out.println();
  }
  }
  }

/*
1  2  3  4  
5  0  0  8  
9  0  0  12  
13  14  15  16  
*/
