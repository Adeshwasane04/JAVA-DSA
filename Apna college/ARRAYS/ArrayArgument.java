package ARRAYS;

public class ArrayArgument {
    public static void main(String args[])
    {
      int marks[]={98,97,95};
      update(marks);
      
      
      
    }
    public static void update(int marks[])
    {
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    

}