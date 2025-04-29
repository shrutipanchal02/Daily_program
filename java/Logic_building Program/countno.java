import java.util.Scanner;
public class countno{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int count=1;
System.out.println("enter the string");
String str=sc.nextLine();
for(int i=0;i<str.length();i++){
if(str.charAt(i)==' '){
count++;
}
}
System.out.println("length of string is"+count);
}
}


