package 단계3_for문;

import java.util.Scanner;

public class 별찍기_2_2439 {
    public static void main(String args[])
    {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        if( 1 <= num &&  num<= 100 )
        {
            for (int i = 0; i < num ;i++) // N line
            {
                for(int j = 0; j+1 < num - i ;j++)
                {
                    System.out.print(" ");
                }
                for(int k = 0; k < i + 1 ;k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
