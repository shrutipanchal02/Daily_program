class pattern26{
public static void main(String[] args)
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
if(j==1 || j==i)
{
System.out.print("  1 ");
}
else
{
System.out.print("  0 ");
}
}
System.out.println();
}
}
}
/*
  1 
  1   1 
  1   0   1 
  1   0   0   1 
  1   0   0   0   1 
  */
