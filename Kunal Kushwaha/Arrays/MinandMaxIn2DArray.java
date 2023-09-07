package Arrays;
import java.util.Arrays;
public class MinandMaxIn2DArray {
    public static void main(String[] args) {
        int arr[][]={
            {2,45,6,7,42,56},
            {34,466,3,77907,1,75,46},
            {342,536,13,545}
        };
        
        System.out.println(MinAndMax(arr));
       
    }
    static int MinAndMax(int arr[][])
    {   int max=Integer.MIN_VALUE;
                for(int Row=0;Row<arr.length;Row++)
                {
                   for(int Col=0;Col<arr[Row].length;Col++)
                   {
                    if(arr[Row][Col]>max)
                    {
                       max=arr[Row][Col];
                       
                   
                    }
                   } 
                }
          
               return max;
            
    }
    
}
