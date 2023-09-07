package Method;

public class CallByvalue {
    public static void main(String[] args) {
        int i=5;
        change(i);
       
        System.out.println(i);
    }
    public static void change(int i)
    {
      i=10;

    }
}
