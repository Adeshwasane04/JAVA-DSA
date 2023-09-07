import java.util.Scanner;
public class Fabonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        int i=1;
        int temp=0;
        int count=0;
        while(n>=count)
        {
             temp=p+i;
             p=i;
             i=temp;
             count++;
             
            
            
        }
        System.out.println(temp);
       
        
    }
    
}
