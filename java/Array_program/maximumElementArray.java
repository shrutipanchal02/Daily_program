public class maximumElementArray{
public static void main(String[] args){
int[] a={10,37,53,21,76,100};
int max=a[0];
int sum=0;
for(int i=1;i<a.length;i++){
if(a[i]>max){
max=a[i];
}
if(a[i]%2==0){
sum=sum+a[i];
}
}
System.out.println("addition of even array element"+sum);
System.out.println("max element : " +max);
}
}
