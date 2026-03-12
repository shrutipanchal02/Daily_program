class pattern23{
public static void main(String[] args)
{
int count;
for (int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
if(i%2==0){
System.out.print(" 0");
}
else{

System.out.print(" " +j);
}
}
System.out.println();
}
}
}
/*
 1
 0 0
 1 2 3
 0 0 0 0
 1 2 3 4 5
*/
