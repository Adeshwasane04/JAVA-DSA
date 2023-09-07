import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int num1=sc.nextInt();
       int div=2;
      while(num1>div) 
      {
        if(num1%div==0)
        {
            System.out.println("not prime");
            System.exit(0);

        }
        else{
            div++;
           
        }

      }
      System.out.println("prime");
    }
    }
      