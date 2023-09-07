import java.util.Scanner;
public class ButterflyPattern 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Butterfly(n);
        

    }
    public static void Butterfly(int n)
    {
        //1st half
        for(int i=1;i<=n;i++)
        {    //for stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            //for spaces =2*(n-i)
            for(int j=1;j<=2*(n-i);j++)
                {   
                    System.out.print( " ");
                }
                //for stars

                for(int j=1;j<=i;j++)
                {
                    System.out.print( "*");
                }
                System.out.println();
        }
    
       
        
         //2st half
         for(int i=n;i>=1;i--)
         {    //for stars
             for(int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
 
             //for spaces =2*(n-i)
             for(int j=1;j<=2*(n-i);j++)
                 {   
                     System.out.print( " ");
                 }
                 //for stars
 
                 for(int j=1;j<=i;j++)
                 {
                     System.out.print( "*");
                 }
                 System.out.println();
    }
}
}
