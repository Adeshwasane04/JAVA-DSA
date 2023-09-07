package BasicSortingAlgorithms;

public class SelectionSort {
    public static void main(String args[])
    {
        int Num[]={5,4,1,3,2};
        Selection(Num);

    }
    public static void Selection(int Num[])
    {    for(int i=0;i<Num.length-1;i++)
        {
        int minpos=i;
        for(int j=i+1;j<Num.length;j++)
        {
            if(Num[minpos]>Num[j])
            {
               minpos=j;
            }

        }
             int temp=Num[minpos];
             Num[minpos]=Num[i];
             Num[i]=temp;
             
    }
    for(int k=0;k<Num.length;k++)
    {
        System.out.print(Num[k]+" ");
    }
    System.out.println();
   
}
}