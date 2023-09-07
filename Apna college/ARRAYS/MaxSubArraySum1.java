package ARRAYS;

public class MaxSubArraySum1 {
    //prefix Which reduce the time compilxity
    //and the time complixity of this program is O(n - square)
    public static void main(String args[])
    {
        int Num[]={1,-2,6,-1,3};
        Array(Num);
    }
    public static void Array(int Num[])
    {    int CurrSum=0;
         int MaxValue=Integer.MIN_VALUE;

        int prefix[]=new int[Num.length];

        prefix[0]=Num[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+Num[i];
        }
        for(int i=0;i<Num.length;i++)
        {    int Start=i;

            for(int j=0;j<Num.length;j++)
            {
                int end=j;
CurrSum=Start==0? prefix[end] :prefix[end]-prefix[Start-1];
                
            }
            if(MaxValue<CurrSum)
            {
                MaxValue=CurrSum;
            }
            
        }
        System.out.println("The Maximum Value Will Be : " + MaxValue);
    }
    
}
