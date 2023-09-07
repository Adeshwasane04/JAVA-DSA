package Method;
import java.util.Scanner;
public class Factorial1 {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();    
        factorial(n);
        System.out.println(factorial (n));
    }
    public static int factorial(int n)
    {     int f=1;
          int i=1;
          for(i=1;i<=n;i++)
          {
            f=f*i;
          }
          return f;
    }
}

        