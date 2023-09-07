package Arrays;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[]={3,4,5,63,6,8,9,1};
        int target=63;
        System.out.println(Search(arr,target,1,6));

    }
    static int Search(int[] arr,int target,int start,int end)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int index=start;index<end;index++)
        {
           if(arr[index]==target)
           {
            return index;
           }

        }
        return -1;
    }
    
}
