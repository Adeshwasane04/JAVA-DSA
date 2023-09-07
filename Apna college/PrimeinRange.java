import java.util.Scanner;
public class PrimeinRange {
    public static void main(String[] args) 
    { 
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Primerange(n);
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

    public static void Primerange(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isprime(i))
            {   //true
                System.out.println(i+" ");
            
            }

            
        }  

        System.out.println();  
    }
    
}
    

