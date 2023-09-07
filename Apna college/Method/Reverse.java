package Method;


    import java.util.Scanner;
public class Reverse
{
    public static void main(String args[])
    {
       
        int Num=-123;
        Number(Num);

        
    }
    public static void Number(int Num)
    {   while(Num>0)
        {
         int N=Num%10;

        System.out.print(N);
        Num=Num/10;
        
    }
}
    
}
