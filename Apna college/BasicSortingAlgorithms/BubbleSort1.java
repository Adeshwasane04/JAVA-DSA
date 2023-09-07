package BasicSortingAlgorithms;
 

public class BubbleSort1 {
    public static void main(String args[])
    {  
        System.out.print("Enter The Array : ");
        int Num[]={4,3,5,4,76,3,87};

        Sort(Num);

    }
    public static void Sort(int Num[])
    {    boolean Swap;
        for(int turn=0;turn<Num.length-1;turn++)
        { 
            Swap=false;
            for(int j=0;j<Num.length-1-turn;j++)
            { if(Num[j]>Num[j+1]){

              int temp=Num[j];
               Num[j]=Num[j+1];
               Num[j+1]=temp;
               Swap=true;
            }
            }
            if(Swap==false)
        {
          break; 
        }
        }
        for(int i=0;i<Num.length;i++)
        {
            System.out.print(Num[i]+" ");
        }
        System.out.println();
    }
    
}
