public class evenArrayFind{
public static void main(String[] args){
int a[]={10,67,23,76,19,96};
int max= a[0];
int sum=0;
for(int i=0;i<a.length;i++){
if(a[i]>max){
max=a[i];
}
if(a[i]%2!=0){
sum=sum+a[i];
}
}
System.out.println("Addition of odd number in the array :" +sum);
System.out.println("maximum element in the array :" +max);
}
}

