package Arrays;

public class Profit {
    public static void main(String[] args) {
        int prices[] ={7,6,4,3,1};
        int ans =maxProfit(prices);
        System.out.println(ans);
    }
    public static int maxProfit(int[] prices) {
        int min=0;
       
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i]<prices[min])
            {
                min=i;
            }

        }
        int profit=0;
        
    int buy=min;
        
        int sell = max(prices,min);
        if(prices[sell]<prices[min]){
            return 0;
        }
        
        profit = prices[sell]-prices[buy];
  return profit;  
}
static int max(int arr[],int start)
    {
        int max=start;
        for(int i=start;i<arr.length;i++)
        {
            if(arr[i]>arr[max])
            {
                max=i;
            }
        }
        return max;
    }
}
