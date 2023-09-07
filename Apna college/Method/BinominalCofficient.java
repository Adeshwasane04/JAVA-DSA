package Method;
import java.util.Scanner;
public class BinominalCofficient {
// we have to calculate the binomial cofficient for the two numbers 

//n!/r!*(n-r)!  this the formula 

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(binocoffi(n,r));
    }
    

    public static int factorial(int n)
    {
        int i=1;
        int f=1;
        for(i=1;i<=n;i++)
        {
         f=f*i;
        }
        return f;

    }
    public static int binocoffi(int n,int r)
    {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int binocoffi=(fact_n/fact_r*fact_nmr);
        return binocoffi;
    }
}

