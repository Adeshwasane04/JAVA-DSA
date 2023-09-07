package BasicSortingAlgorithms;

public class CountingSort1 {
    public static void main(String args[])
    {
        int Num[]={1,4,1,3,2,4,3,7};
        Counting(Num);

    }
    public static void Counting(int Num[])
    {
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<Num.length;i++)
        {
            Largest=Math.max(Num[i],Largest);
        }

        //frequency
        int count[]=new int[Largest+1];
        for(int i=0;i<Num.length;i++)
        {
            count[Num[i]]++;
        }

        //sorting
        int j=0;
    for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                Num[j]=i;
                j++;
                count[i]--;
            }
        }
        for(int i=0;i<Num.length;i++)
        {
            System.out.print(Num[i]+" ");
        }
        System.out.println();
    }
    
}
