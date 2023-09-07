package Arrays;

public class MinimumInArray {
 public static void main(String[] args)
  {
    int[] arr={3,4,5,-6,8,54};
    System.out.println(Minimum(arr));

 }
static int Minimum(int arr[])
{  int ans=arr[0];
  for(int i=1;i<arr.length;i++)
  {
     if(ans>arr[i]){
     ans=arr[i];
     }
  }
  
  return ans;
}
}
