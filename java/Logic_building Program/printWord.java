import java.util.Scanner;
public class printWord{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int count=0;
System.out.println("enter the string");
String str=sc.nextLine();
for(int i=0;i<str.length();i++){
if(str.charAt(i)=='s'){
count++;
}
}
System.out.println(count);
}
}
