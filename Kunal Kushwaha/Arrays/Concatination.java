package Arrays;
import java.util.Arrays;
import java.util.*;
public class Concatination {
 public static void main(String[] args) {
    int arr[]={1,2,1};
   Con(arr);
   
 }
 static void Con(int arr[])
 {
    int nums[]=new int[2*arr.length];
    for(int i=0;i<arr.length;i++)
    {
        nums[i]=arr[i];
    }
    for(int i=0;i<arr.length;i++)
    {
        nums[i+arr.length]=arr[i];
    }
    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i]);
    }
    System.out.println();
    
    
 }

}
