import java.util.Scanner;
public class Average {
    public static void main(String args[])
    {
        System.out.print("Enter the three number: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.print("average = ");
        AverageNumber(a,b,c);
    }
    public static void AverageNumber(int a, int b,int c)
    {
       int d=a+b+c;
       int f=d/3;
       System.out.println(f);
       
    }
    
    
}
