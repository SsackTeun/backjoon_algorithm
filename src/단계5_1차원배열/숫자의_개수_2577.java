package 단계5_1차원배열;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class 숫자의_개수_2577 {

    public static int multiply(int A, int B, int C){
        return A * B * C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int multiply = multiply(A,B,C);

        int[] intArray = Stream.of(String.valueOf(multiply).split("")).mapToInt(Integer::parseInt).toArray();

        long count = 0L;

        for(int i = 0; i < 10; i ++){
            int a = i;
            count = Arrays.stream(intArray)
                    .filter(n -> n == a)
                    .count();
            System.out.println(count);
        }
    }
}
