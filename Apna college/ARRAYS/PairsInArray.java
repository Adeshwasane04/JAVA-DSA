package ARRAYS;

public class PairsInArray {
    public static void main(String args[])
    {
        int arr[]={2,3,4,5,6,7,8};
        Pairs( arr);

    }
    public static void Pairs(int arr[])
    {
        int tp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            System.out.print("("+arr[i]+","+arr[j]+")"+" ");
            tp++;
            }
            System.out.println();
           
    }
    System.out.println("Total Pairs="+tp);
}
}