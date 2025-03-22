public class kthlarge{
public static void main(String[] args){
int[] a={5,2,9,1,4,12,6};
int k=2;
for(int i=0;i<a.length-1;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]<a[j]){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
if(i==k-1){
System.out.println("kth largest element :" +a[i]);
break;
}
}
}
}
