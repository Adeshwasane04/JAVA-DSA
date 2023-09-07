package Arrays;
import java.util.Scanner;
public class Hollow {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Rows And The Columns : ");
        int Row=sc.nextInt();
        int Col=sc.nextInt();

        Pattern(Row,Col);
    }
    static void Pattern(int Row,int Col)
    {
        for(int i=1;i<=Row;i++)
        {
            for(int j=1;j<=Col;j++)
            {
                if(i==1 || i==Row || j==1 || j==Col)
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
