import java.util.Scanner;
public class DecimaltoBinary {
    public static void main(String args[])
    {
      System.out.print("Enetr the decimal number: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      DecimalBinary(n);
    }
    public static void DecimalBinary(int n)
    {
        int Bin=0;
        int pow=0;
        while(n>0)
        {
        int rem=n%2;
        Bin=Bin+(rem*(int)Math.pow(10,pow));
        pow++;
        n=n/2;
        }
        System.out.println(Bin);
    }
    
  }
