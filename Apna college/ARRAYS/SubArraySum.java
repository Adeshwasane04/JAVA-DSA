package ARRAYS;

public class SubArraySum {
    public static void main(String args[])
    {
        int Num[]={2,3,4,5};
        SubArray(Num);

    }
    public static void SubArray(int Num[])
    {  int sum=0;
        for(int i=0; i<=Num.length;i++)
        {
            sum=sum+ Num[i];
            System.out.println(sum);
        }
        
    }
}