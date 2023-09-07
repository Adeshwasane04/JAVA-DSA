package Arrays;
import java.util.Arrays;
public class RunningSum {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4};
        String(arr);
    }
    public static void String(int arr[])
    {    
        int[] ans = new int[arr.length];
        int sum=0;
        for (int i = 0; i < ans.length; i++) {
            sum = sum+arr[i];
            ans[i]=sum;
        }
       
        
            System.out.print(Arrays.toString(ans));
        
      
    }

    
}
