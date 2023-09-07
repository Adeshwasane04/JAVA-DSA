import java.util.Scanner;
import java.util.Arrays;
public class SimpleArray {
    
    public static void main(String args[])
    {
        int Num[]=new int[5];
        Scanner sc=new Scanner (System.in);
        for(int i=0;i<Num.length;i++)
        {
             Num[i]=sc.nextInt();
             
        }
        System.out.print(Arrays.toString( Num));
    }
    
}
