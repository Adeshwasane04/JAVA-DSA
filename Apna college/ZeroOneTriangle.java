import java.util.Scanner;
public class ZeroOneTriangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Triangle(n);

    }
    
    public static void Triangle( int n)
    {  //for outter loop
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");

                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
