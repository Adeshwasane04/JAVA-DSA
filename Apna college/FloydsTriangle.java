import java.util.Scanner;
public class FloydsTriangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Floyds(n);
    }


    public static void Floyds(int n)
    {  //for loop for outter
        int count=1;
         for(int i=1;i<=n+1;i++)
         {
            for (int j=1;j<=i;j++)
            {
                System.out.print( " "+count);
                count++;
            }
            System.out.println();
         }
         
    }

    
}
