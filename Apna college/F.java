import java.util.Scanner;
public class F {
    public static void main(String args[])
    {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Number(n);

    }
    public static void Number(int n)
    {
        int a=0;
        int b=1;
        int count=0;
        while(n>=count)
        {
            int c=a+b;
             a=b;
             b=c;
             count++;

        }
        System.out.println(b);
    }
    
}
