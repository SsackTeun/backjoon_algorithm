package 단계8_기본_수학1;

import java.util.Scanner;

public class 설탕배달_2839 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        int mok3 = i/3 , mok5 = i/5;

        if(i == 4 || i == 7)
        {
            System.out.println(-1);
        }

        else if(i % 5 == 0)
        {
            System.out.println(mok5);
        }
        else if(i % 5 % 2 == 1)
        {
            System.out.println((i/5) + 1);
        }
        else
        {
            System.out.println((i/5) + 2);
        }
    }
}
