package Method;
import java.util.Scanner;

public class Hello {
    public static void  Helloworld()
    {
    System.out.println("Hello world");
    System.out.println("Hello world");
    System.out.println("Hello world");

    
}
public static int CalculateSum(int num1,int num2)
{

    Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int sum=num1+num2;
return sum;


}
public static void main(String[] args) {
Helloworld();
 int ans =CalculateSum(5,77);
System.out.println(ans);
}
}




