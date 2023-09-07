package Method;
import java.util.Scanner;
public class Fctorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
    
}
