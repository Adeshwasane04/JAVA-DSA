import java.util.Scanner;
public class Prime1 {
    public static void main(String[] args) 
    { Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isprime(n));

        
    }
    public static boolean isprime(int n)
    {
        boolean isprime=true;
        for( int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                 isprime=false;
                 break;
            }
        }
        return isprime;

    }
}