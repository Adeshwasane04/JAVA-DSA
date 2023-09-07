package Arrays;

public class Leetcode1295 {
    public static void main(String[] args)
     {
        int [] arr={12,345,2,6,7896};
        System.out.println(Numbers(arr));
    }
    static int Numbers(int arr[])
  {
    int ans=0;
    for (int i = 0; i < arr.length; i++) {
        int digit=0;
        while(arr[i]>0)
        {
            digit++;
            arr[i]/=10;

        }
        if(digit%2==0)
        {
            ans++;
        }
    }
    return ans;
  }
}