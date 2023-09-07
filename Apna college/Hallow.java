import java.util.Scanner;
public class Hallow {
    public static void main(String args[])
    {
        System.out.println("Enter the rows and coloum");
        Scanner sc=new Scanner(System.in);
        int rows =sc.nextInt();
        int colo=sc.nextInt();
        Hallow_Pattern(rows,colo);
    }
    public static void Hallow_Pattern(int rows,int colo)
    {   //for outer rows
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=colo;j++)
            {
             if(i==1 || i==rows || j==1 || j==colo)
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
