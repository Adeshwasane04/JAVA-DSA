package ARRAYS;

public class ReverseArray {
    public static void main(String args[])
    {
     int Num[]={2,3,4,5,6,7,8,98};
     Reverse(Num);
     ///for loop for print
     for(int i=0;i<Num.length;i++)
     {
        System.out.print(Num[i]+ " ");
     }
      
    }
    public static void Reverse(int Num[])
    {   int Start=0;
        int End =Num.length-1;
        while(Start<End)
        {
          int temp=Num[End];
          Num[End]=Num[Start];
          Num[Start]=temp;
          Start++;
          End--;
        }
    }    
}
