package Arrays;



public class LinearSearch {
    public static void main(String []args)
    {
        int arr[]={2,3,45,6,7,78,9,};
    Linear(arr);
    }
    static int Linear(int arr[])
    {   int target=78;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("Target is at index : "+ i);
                break;
            }
    }
    return -1;
}
}
