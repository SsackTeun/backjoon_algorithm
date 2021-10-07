package 단계6_함수;

import java.util.Scanner;

public class 한수_1065 {
    public static int calculation(int input){
        int count = 0;

        if (input < 100){
            return input;
        }
        else{
            count = 99;
            if(input == 1000) {
                input = 999;
            }

            for (int i = 100; i <= input; i++) {
                int hundreds = i / 100;
                int tens = (i / 10) % 10;
                int units = i % 10;

                if((hundreds - tens) == (tens - units)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // 1 <= N <= 1000
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(calculation(input));
    }
}
