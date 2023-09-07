package Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int nums[]={0,1,2,2,3,0,4,2};
        int val=2;
        int ans=Element(nums,val);
        System.out.println(ans);
    }
     static int Element(int nums[],int val)
     {    int count =0;
         for(int i=0;i<nums.length;i++)
         {
            if(nums[i]==val)
            {
                count++;
            }
         }
         return count++;
     }
    
}
