package TWODArrays;
import java.util.Scanner;
//creation of the 2 d arrys with searching tecnique
public class Creation {
  public static void main(String args[])
  {
    int matrix[][]=new int [3][3];
     System.out.println("Enter The 9 Numbers : ");
    int n=matrix.length;
    int m=matrix[0].length;
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        matrix[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
    array(matrix,5);
  }
  public static boolean array( int matrix[][],int key)
  {
    for(int i=0;i<matrix.length;i++)
    {
      for(int j=0;j<matrix[0].length;j++)
      {
        if(matrix[i][j]==key)
        {    System.out.println("key found at index : " +"("+i+","+j+")");
            return true;
            
        }
      }
    }
    System.out.println("Not Found");
   return false;

  }

}
