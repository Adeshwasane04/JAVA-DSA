package BasicSortingAlgorithms;

public class BubbleSort
 {
    public static void main(String args[])
    { int Num[]={5,4,1,3,2};
      Sort(Num);

     }
    public static void Sort(int Num[])
    {
       for(int turn=0;turn<Num.length-1;turn++)
       {
        for(int j=0;j<Num.length-1-turn;j++)
        {
             if(Num[j]>Num[j+1])
             {
                int temp=Num[j];
                Num[j]=Num[j+1];
                Num[j+1]=temp;
             }
        }
       }
       for(int i=0;i<Num.length;i++)
       {
         System.out.print(Num[i]+" ");
       }
       System.out.println();
    }
    
 }