package 단계7_문자열;

import java.util.Scanner;

public class 상수_2908 {
    public static int reverseNumber(int num){
        int reverse = 0;

        String reverseStr = String.valueOf(num);

        String hundreds = String.valueOf(reverseStr.charAt(2));
        String tens = String.valueOf(reverseStr.charAt(1));
        String units = String.valueOf(reverseStr.charAt(0));

        reverse = Integer.parseInt(hundreds) * 100 + Integer.parseInt(tens) * 10 + Integer.parseInt(units) * 1;

        return reverse;
    }

    public static int largerNumber(int reverseA, int reverseB){
        int largerThan = 0;
        if(reverseA > reverseB){
            return reverseA;
        }else
        {
            return reverseB;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int reverseA = reverseNumber(sc.nextInt());
        int reverseB = reverseNumber(sc.nextInt());

        System.out.println(largerNumber(reverseA, reverseB));
    }
}
