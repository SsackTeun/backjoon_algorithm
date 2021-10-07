package 단계5_1차원배열;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class 최댓값_2562 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[9];

        for(int i=0; i <numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        IntStream max = Arrays.stream(numbers);
        int maxnumber = max.max().getAsInt();

        System.out.println(maxnumber);

        for(int i = 0; i < numbers.length; i ++){
            if(numbers[i] == maxnumber) {
                System.out.println(i+1);
            }
        }
    }
}
