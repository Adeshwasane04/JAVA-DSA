package Arrays;

public class ArraySum {
    public static void main(String args[])
    {
       int arr[]={2,7,11,15};
       Array(arr);
    }
public static void Array(int arr[])
{      int  target=9;
    for(int i=0;i<arr.length;i++)
    {
       for(int j=i+1;j<arr.length;j++)
       {
          if(arr[i]+arr[j]==target)
          {
            System.out.print("["+i+","+j+"]");
           
          }
       }
         
       } 
     
    }
   
}
    