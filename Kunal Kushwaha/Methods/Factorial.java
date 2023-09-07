import java.util.Scanner;
public class Factorial {
    public static void main(String args[])
    {
        int i=1;
        int fact=1;
        System.out.println("Enter the number for the factorial:");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
           
           System.out.println(fact);
    }
    System.out.println("so the facto is :"+fact);
    
}
}