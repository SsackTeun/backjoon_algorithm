package 단계3_for문;

import java.util.Scanner;

public class 합_8393 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int n = 0, sum = 0;
        n = scan.nextInt();

        if(1 <= n && n <= 10000)
        {
            for(int i = 1; i <= n; i++)
            {
                sum = i + sum;
            }
            System.out.print(sum);
        }
    }
}
