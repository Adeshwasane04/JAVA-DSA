package Arrays;
import java.util.Arrays;
public class TwoSum {
    public static void main(String args[])
    {
       int arr[]={2,34,6,7,8,3};
       int target=5;
      Array(arr,target);
    }
    static void Array(int arr[],int target)
    {   
        for(int i=0;i<arr.length;i++)
        {   int j=1;
           for(j=1;j<arr.length;j++)
            {
               if(arr[i]+arr[j]==target)
               {
                 System.out.println("["+i+","+j+"]");
               }
            }
        }
        
    }
    
}
