import java.util.Scanner;
public class Isprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       boolean ans =isprime(n);
        System.out.println(ans);
        isprime(a);
        
        
    }
    public static boolean isprime(int a)
    {
        if( a<=1)
        {
            return false;
        }
        int c=2;
        while(c*c<=a)
        {
            if (a%c==0) {
                return false;

            }
            else{
                c++;

            }
return false;
            
        }
    }

    
}
