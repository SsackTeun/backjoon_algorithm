package 단계1_입출력과사칙연산;

import java.util.Scanner;

public class 나머지_10430 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        System.out.println((a+b)%c);
        System.out.println((a%c + b%c)%c);
        System.out.println((a*b)%c);
        System.out.println((a%c * b%c)%c);
    }
}
