import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(45,48,88,36,51,58);
 
    }
public static void fun( int ...v)
{
    System.out.println(Arrays.toString(v));
}
}
  