import java.util.Scanner;
public class HollowRectangle
{
    public static void main (String args[])
    {
        System.out.println("Enter the rows and the coloums : ");
        Scanner sc=new Scanner(System.in);
        int rows =sc.nextInt();
        int col =sc.nextInt();
          Hollow_Rectangle(rows,col);
    }
    public static void Hollow_Rectangle(int rows ,int col)
    {
        for(int i=1;i<=rows;i++)
        {
            for( int j=1; j<=col;j++)
            {
                if(i==1 || i==rows || j==1 || j==col)
                { 
                   System.out.print("*");
                }
                else
                {
                        System.out.print( " ");
                }
            }
            //this is used for the new line 
            System.out.println();
        }
    }
}