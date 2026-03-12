class pattern22{
public static void main(String[] args)
{
int count;
for (int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(" "+j);
}
System.out.println();
}

for (int i=4;i>=1;i--)
{

for(int j=1;j<=i;j++)
{
System.out.print(" "+j);

}
System.out.println();
}
}
}
/*
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1
 */
