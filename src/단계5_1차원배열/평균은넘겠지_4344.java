package 단계5_1차원배열;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class 평균은넘겠지_4344 {
    // input 1 : 테스트 케이스의 개수 C
    // input 2 ~ : 학생 수 | 점수, 점수 ~~..

    // output 1 : 평균 이상인 비율을 소수저 셋째까지 출력

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCounter = sc.nextInt();

        for(int i = 0; i < testCounter; i++){
            int studentCounter = sc.nextInt();
            int[] Score = new int[studentCounter];
            int sum = 0;
            for (int j = 0; j < Score.length; j++){
                Score[j] = sc.nextInt();
                sum += Score[j];
            }
            OptionalDouble average = Arrays.stream(Score).average();
            double averageScore = average.getAsDouble();

            long total = Arrays.stream(Score).count();

            long totals = Arrays.stream(Score).filter(x-> x > averageScore).count();

            double t = totals / (double) total * 100;

            System.out.println(String.format("%.3f", t) + "%");
        }
    }
}
