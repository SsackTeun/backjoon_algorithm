package 단계3_for문;

import java.util.Scanner;

public class 별찍기_1_2438 {
    public static void main(String args[])
    {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        if( 1 <= num &&  num<= 100 )
        {
            for(int j = num; j >= 1; j-- )// n줄 출력
            {
                for(int k = 1; k <= num + 1 - j; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
