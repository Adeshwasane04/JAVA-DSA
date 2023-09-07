package Arrays;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        
        int arr[]={23,45,676,777888,798787,5576788};
        int target=676;
        int ans=Agnostic(arr,target);
        System.out.println(ans);


    }
    static int Agnostic(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;

        boolean isAsc;
        if(arr[start]<arr[end])
        {
            isAsc=true;
        }
        else{
            isAsc=false;
        }
       
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAsc)
            {
                if(target<arr[mid])
                {
                     end=mid-1;
                }
                else if(target>arr[mid])
                {
                   start=mid+1; 
                }
            }
            else
            {
                if(target>arr[mid])
                {
                     end=mid-1;
                }
                else if(target<arr[mid])
                {
                   start=mid+1; 
                }
            }
        }
        return -1;
    }
}

