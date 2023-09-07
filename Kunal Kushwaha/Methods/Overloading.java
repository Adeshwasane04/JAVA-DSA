public class Overloading 
//to or more method having the same name as long as their parameter are the different 
//are knowns as method overloading
{
    public static void main(String[] args) {
fun(10,20);
fun("adesh");
        
    }
    public static void fun(int a,int b)

    {
       int sum=a+b;
System.out.println(sum);
    }
     
    static void fun(String name)
    {
        System.out.println(name);
    }
}
