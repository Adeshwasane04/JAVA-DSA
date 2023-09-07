import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class HalloRhombus {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Hollow(n);

    }
    public static void Hollow(int n)
    {
        //for spaces
        for(int i=1;i<=n;i++)
         {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            //rectangle
            for(int j=1;j<=n;j++ )
            {
                if(i==1 || i==n || j==1 || j==n)
                {
                    System.out.print("*");
                }
                else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
         }
    }
    
