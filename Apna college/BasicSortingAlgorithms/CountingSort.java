package BasicSortingAlgorithms;
import java.util.Arrays;
public class CountingSort {
    public static void main(String args[])
    {
        int Num[]={1,4,1,3,2,4,3,7};
        Counting(Num);
    }
    public static void Counting (int Num[])
    {
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<Num.length;i++)
        {
           Largest=Math.max(Largest,Num[i]);
           
        }
        //frequency array
        int i=0;
        int count[]=new int[Largest+1];
        for( i=0;i<Num.length;i++);
        {   
            count[Num[i]]++;
        }
         
        //sorting 
        int j=0;
        for( i=0;i<count.length;i++)
        {
           while(count[i]>0)
           {
                 Num[j]=i;
                 j++;
                 count[i]--;
           }
        }

        //print

        for( i=0;i<Num.length;i++)
        {
            System.out.print(Num[i]+" ");
        }
        System.out.println();
    }
}
