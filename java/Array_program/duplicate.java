public class duplicate{
public static void main(String[] args){
int[] a={2,5,7,9,2,1};
int sum=0;
for(int i=0;i<a.length-1;i++){
    for(int j=i+1;j<a.length;j++){
       if(a[i]==a[j] && i!=j){ 
         System.out.print( "duplicate elements are : " +a[i]);   
         
if(a[i]%2==0){
  sum=sum+a[i];
     }
  }
}
}
System.out.println();
System.out.println("sum of even duplicate element in the array : " +sum);              
}
}


