package 단계5_1차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class 나머지_3052 {
    public static long remainder(int[] dividend, int divisor){
        return  Arrays.stream(dividend)
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        //input 10s
        //% 42

        Scanner sc = new Scanner(System.in);

        //제수
        int[] dividend = new int[10];

        //피제수
        final int divisor = 42;

        for (int i = 0; i < dividend.length; i++){
            dividend[i] = sc.nextInt();
            dividend[i] %= divisor;
        }
        sc.close();
        System.out.println(remainder(dividend, divisor));
    }
}
