package Arrays;
import java.util.Arrays;
public class Arrayspermutation {
    public static void main(String args[])
    {
        int num[]={0,1,4,5,3,2};
    Numbers(num);
    }
    public static void Numbers(int nums[])
    {
        for(int i=0;i<nums.length;i++)
        {    int minpos=i;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[minpos]>nums[j])
                {
                   minpos=j;
                }
            }

            int temp= nums[minpos];
             nums[minpos]=nums[i];
             nums[i]=temp;
        }
     
            
            System.out.print(Arrays.toString(nums));
        
        
    }
}
