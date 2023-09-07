package ARRAYS;

public class MaxSubArraySum2 {
    //this algorithms is very important
public static void main(String args[])
{
  int Num[]={-2,-3,4,-1,-2,1,5,-3};
  Kadans(Num);

}
  public static void Kadans(int Num[])
  {
     int CurrSum=0;
     int MaxSum=Integer.MIN_VALUE;
     
     for(int i=0;i<Num.length;i++)
     {
        CurrSum=CurrSum+Num[i];
        if(CurrSum<0)
        {
            CurrSum=0;
        }
        MaxSum=Math.max(CurrSum,MaxSum);
     }
     System.out.println("Our Maximum Sum is : "+MaxSum);
  }
}