package ARRAYS;

public class MaxSubArraySum {
    public static void main(String args[])
    {
        int Num[]={2,4,6,8,10};
        Array(Num);

    }
    public static void Array(int Num[])
    {  int currSum=0;
        int MaxSum=Integer.MIN_VALUE;
        for (int i=0;i<Num.length;i++)
        {
            int first=i;
            for(int j=i;j<Num.length;j++)
            {  
                int end=j;
                currSum=0;
                for( int k=first;k<=end;k++)
                {
                  currSum=currSum+Num[k];
                }
                System.out.println(currSum);
                if(MaxSum<currSum)
                {
                    MaxSum=currSum;
                }

            }
            
        }
        System.out.println("The Maximum Sum Is "+MaxSum); 
    }
    
}
