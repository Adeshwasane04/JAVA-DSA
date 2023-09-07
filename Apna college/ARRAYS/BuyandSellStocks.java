package ARRAYS;

/*  you are given an array prices where prices[i] is the
 price of the given stocks on the i day. 
 you want to maximize yours profit by choosing a single day to 
 buy one stock and choosing a differnt day in the future to sell 
 that stock return the maximum profit you can achieve from this 
 traction if you can not achieve any profit return 0.
 */

public class BuyandSellStocks {
    public static void main(String args[])
    {
        int price[]={7,1,5,3,6,4};
         System.out.println(Stocks(price)); 
    }
    public static int Stocks(int price[])
    {
        int Buyprice=Integer.MAX_VALUE;
        int Maxprofit=0;
        for(int i=0;i<price.length;i++)
        {
            if(Buyprice<price[i])
            {
                //profit
                int profit=price[i]-Buyprice;  //todays profit
                Maxprofit=Math.max(Maxprofit,profit);
            }
            else
            {
               Buyprice=price[i];
            }
        }
        return Maxprofit;
    }
}
