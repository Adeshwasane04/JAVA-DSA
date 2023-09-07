import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Marks {
    public static void main(String args[])
    {    System.out.print("Enter his/her Examination marks : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Your grade is : ");
        isMarks(n);

    }
    public static void isMarks(int n)
    {
       if(n>=91)
       {
        System.out.println("AA");
       }
      else if(n>=81)
    { 
        System.out.println("AB");
        
    }
     else if(n>=71)
    {
        System.out.println("BB");
    }
     else if(n>=61)
    {
        System.out.println("BC");
    }
     else if(n>=51)
    {
        System.out.println("CD");
    }
     else if(n>=41)
    {
        System.out.println("DD");
    }
    else
    {
        System.out.println("Fail");
    }
    }
    }
    
   
 
