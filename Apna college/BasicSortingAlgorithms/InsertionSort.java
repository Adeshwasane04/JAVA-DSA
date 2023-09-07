package BasicSortingAlgorithms;

public class InsertionSort {
    public static void main(String args[])
    {
        int Num[]={5,4,1,3,2};
        Insertion(Num);
        print(Num);
    }
      public static void Insertion(int Num[])
     {  
        for(int i=1;i<Num.length;i++)
        {
            int curr=Num[i];
            int previous=i-1; 

            //finding out the correct position to insert

            while(previous>=0 && Num[previous]>curr)
            {
                  Num[previous+1]=Num[previous]; 
                  previous--; 
            }    //insertion

                 Num[previous+1]=curr;
        } 
     }
     public static void print(int Num[])
     {
        for(int i=0;i<Num.length;i++)
        {
            System.out.print(Num[i]+" ");
        }
        System.out.println();
     }
    
    }