import java.util.Scanner;
public class palindrome1{
    public static void main(String[] args) {
        int s=0,r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:" );
        int n=sc.nextInt();
         c=n; 
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
            System.out.println("palindrome");
        else
        System.out.println("Number is not palindrome");
    }
}
