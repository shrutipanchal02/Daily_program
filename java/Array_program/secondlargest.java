public class secondlargest{
public static void main(String[] args){
int temp;
int[] a={6,8,2,4,3,1,5,7};
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]<a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}}
if(i==1){
break;
}
}
System.out.println("second large element : " +a[1]);
}
}
