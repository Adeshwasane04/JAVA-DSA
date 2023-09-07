import java.util.Scanner;
public class PyramidwithNumbers
{
    public static void main(String args[])
    {   System.out.print("Enetr the numbers : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Inverted(n);
    }
    public static void Inverted(int n)
    {
      for(int i=1;i<=n;i++)
      {
        for (int j=1;j<=n-i+1;j++)
        {
            System.out.print(" "+j);
        }
        System.out.println();
      }
    }
}

