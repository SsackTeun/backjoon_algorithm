package 단계5_1차원배열;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class 최소최대_10818 {
    public static int max(int[] m){
        IntStream stream = Arrays.stream(m);
        int result = stream.max().getAsInt();
        return result;
    }

    public static int min(int[] m){
        IntStream stream = Arrays.stream(m);
        int result = stream.min().getAsInt();
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int input = 0;

        int[] number = new int[s];

        for(int i = 0; i < s; i ++){
            input = sc.nextInt();
            number[i] = input;
        }
        System.out.println(min(number) + " " + max(number));
    }
}
