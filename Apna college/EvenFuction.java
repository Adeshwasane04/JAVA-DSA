import java.util.Scanner;
public class EvenFuction {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isEven(num))
        {
            System.out.println("this is even number");
        }
        else{
            System.out.println("This is odd number");
        }
    }
         
    
    
    public static boolean isEven(int num)
    {
        if(num%2==0)
        {
            return true;

        }
        else
        {
            return false;
        }
    }

}