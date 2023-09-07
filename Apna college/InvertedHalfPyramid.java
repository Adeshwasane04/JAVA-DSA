import java.util.Scanner;
public class InvertedHalfPyramid {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Inverted(n);

    }
    public static void Inverted(int n)
    {
        for( int i=1;i<=n;i++)
        {   //this loop is for the spaces
          for( int j=1;j<=n-i;j++)
             {
                System.out.print(" ");
             }

            //and this is for the stars
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");

            }
 System.out.println();
        }
    }
}
