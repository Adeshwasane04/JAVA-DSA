package ARRAYS;
import java.util.Scanner;
public class BinarySearch {
    
    public static void main(String args[])
    {
     int Num[]={3,34,46,75,86,95,677,4356};
     Scanner sc=new Scanner(System.in);
     int key=sc.nextInt();
     
     System.out.println("The Key Is At Index : "+Binary( Num, key));

    }
    public static int Binary(int Num[],int key)
    {
        int start=0;
        int end=Num.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(Num[mid]==key)
            {    
                return mid;
            }
            if(Num[mid]<key)
            {
             start=mid+1;

            }
            else
            {
             start=mid-1;
            }
        }
        return -1;
    }
}