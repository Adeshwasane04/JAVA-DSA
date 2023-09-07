package ARRAYS;
import java.util.Scanner;
public class LinearSearch
{
           public static void main(String args[])
     {
       int Num[]={5,3,4,6,7,45,345,36};
       Scanner sc=new Scanner(System.in);
       int key=sc.nextInt();
       int index=Linear(Num,key);
       if(index==-1)
       { 
        System.out.println("key is not found");
     }
       else{
        System.out.println("Key is at Index : "+index);
       
       
       }

    }
    public static int Linear(int Num[],int key)
    {
        for(int i=0;i<Num.length;i++)
        {
            if(Num[i]==key)
            {
              return i;
            }
        }
        return -1;
    }
    }
