package ARRAYS;
import java.util.Scanner;
public class LargestinArray 
{
public static void main(String args[])
{
    int arr[]={423,2345,67,56,78584,453};
    System.out.println("the Largest Element In The Arrray is : " +getLargest( arr));
}
public static int getLargest(int arr[])
{   //-infinity
    int Largest=Integer.MIN_VALUE;
    int Smallest=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++)
    {
        if(Largest<arr[i]) 
        {
            Largest=arr[i];
    }
    if(Smallest>arr[i])
    {
        Smallest=arr[i];
       
    }
    
}
System.out.println("The Smallest Value in the array is:  "+Smallest);
return Largest;

}
}
