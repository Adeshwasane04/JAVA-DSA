package BasicSortingAlgorithms;
import java.util.Arrays;

public class InbuiltSort {
    public static void main (String args[])
    {
        int arr[]={5,2,3,1};
        Arrays.sort(arr);
        //we can also do
        //Arrays.sort(arr,0,3)
       printArr(arr);
    }
    public static void printArr(int arr[])

{
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+ " ");
    }
    System.out.println();
}
    
}
