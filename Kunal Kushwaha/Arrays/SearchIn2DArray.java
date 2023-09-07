package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][]={
            {24,54,3,2,5,6},
        {4,65,4,34,66,45},
        {546,6784,689,90}
    };
    System.out.print("Enter the elemet to be Search : ");
    Scanner sc=new Scanner(System.in);
   
    int Target=sc.nextInt();
   
    int ans[]=Search(arr,Target);
   
    System.out.println(Arrays.toString(ans));
  
}
    static int[] Search(int arr[][],int Target)
    {
        for(int Row=0;Row<arr.length;Row++)
        {
            for(int Col=0;Col<arr[Row].length;Col++)
            {
                if(arr[Row][Col]==Target)
                {
                    return new int[]{Row,Col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
