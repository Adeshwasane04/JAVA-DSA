package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={-2,0,1,2,3,4,5,6,7,8,66,86,90};
        int target=86;
        int ans=Binarysearch(arr,target);
        System.out.println(ans);


    }
    static int Binarysearch(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {  
             //to find the median of the array
            // int mid=(start+end)/2;

            //if size of the array is so big that is exceeded the int varible so 
            // we can do like this
             int mid=start+(end-start)/2;

             if(target<arr[mid])
             {
                end=mid-1;
             }
             else if(target>arr[mid])
             {
                start=mid+1;
             }
             else{
                return mid;
        }

    }
    return -1;
}
}