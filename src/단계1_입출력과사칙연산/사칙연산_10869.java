package 단계1_입출력과사칙연산;

import java.util.Scanner;

public class 사칙연산_10869 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
