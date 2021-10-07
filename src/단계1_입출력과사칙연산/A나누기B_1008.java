package 단계1_입출력과사칙연산;
import java.util.Scanner;

public class A나누기B_1008 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextInt();
        double b = scan.nextInt();
        String str = String.format("%.10f",a/b);
        System.out.println(str);

    }
}
