package ARRAYS;

public class Assignment1 {
    public static void main(String args[])
    {
        int arr[]={1,1,1,3,3,3,4,3,2,4,2};
       System.out.println(Array(arr)); 
        

    }
    public static boolean Array(int  arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {    for(int j=i+1;j<arr.length;j++)
            {
            if(arr[i]==arr[j])
            {
                return true;
            }
        }    
    } 
    return false;
}
}