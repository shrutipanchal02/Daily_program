public class missno 
{
      public static void main(String[] args)
      {
            int[] a={1,2,3,4,5,6,8,9};
            int expected_no_elements=a.length+1;
            int total_sum=expected_no_elements*(expected_no_elements+1)/2;
            int sum=0;
            for(int i=0;i<a.length;i++)
            {
                   sum=sum+a[i];
            }
            System.out.println("missing no : " +(total_sum-sum));
            
       }
}

