import java.util.Scanner;
public class ArmstrongNumber
{
    //...
    public static void main(String args[])
    {   System.out.print("Enter the number : ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
         System.out.print(isArmstrong(n));
        
    }
    public static boolean isArmstrong(int n)
    {
       int original=n;
       int sum=0;
       while(n>0)
       {
        int rem=n%10;
        n=n/10;
        sum=sum+rem*rem*rem;
       }
       if(sum==original)
       {
        return true;
       }
      else{
        return false;
      }
    }
}
