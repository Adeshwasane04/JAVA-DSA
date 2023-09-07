import java.util.Scanner;
public class PalindromicPattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Palindromic(n);

     }
     public static void Palindromic(int n)
     {
        //outter loop

        for(int i=1;i<=n;i++)
        {
            ///for spaces
            for (int j=1;j<=n-i;j++ )
            {
                System.out.print(" ");
            }

            // descending
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
                //ascending
                for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }  
            System.out.println();      
        }
     }
    
}
