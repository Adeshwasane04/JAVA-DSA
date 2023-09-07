import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class BinarytoDecimal {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
BinaryDecimal(n);

}
public static void BinaryDecimal(int n)
{
    int pow=0;
    int dec=0;
    while( n>0)
    {
        int lastdigit=n%10;
        dec=dec+(lastdigit*(int)Math.pow(2,pow));
        pow++;
        n=n/10;

    }
    System.out.println(dec);
}

}
