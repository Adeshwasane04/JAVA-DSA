package ARRAYS;
//very important for the exam or the interview 

/*  Given n non negative integers representing an elevation(height)
map where the width of each bar is 1, compute how much 
water it can trap after raining.
 */

public class TrappedWater {
    public static void main(String args[])
    {
        int height[]={4,2,0,6,3,2,5};
       
        Trapped(height);

    }
    public static void Trapped(int height[])
    { 
        //Calculate left max Boundary - Array

       int Maxleft[]=new int[height.length];
       
       Maxleft[0]=height[0];
       
       for(int i=1;i<height.length;i++)
       {
        Maxleft[i]=Math.max(height[i],Maxleft[i-1]);
       }
         //Calculate right max Boundary - Array
       
        int Maxright[]=new int[height.length];
       
       Maxright[height.length-1]=height[height.length-1];
       
       for(int i=height.length-2;i>=0;i--)
       {
            Maxright[i]=Math.max(height[i],Maxright[i+1]);
           
       }
       int TrappedWater=0;
       //loop
      
       for(int i=0;i<height.length;i++)
       {
        int Waterlevel=Math.min(Maxleft[i],Maxright[i]);
        //trapped water =waterlevel-height[i]
    
        TrappedWater=TrappedWater+Waterlevel-height[i];
       }
      System.out.println("The Trapped Water Level Is : "+TrappedWater);
    }
}
