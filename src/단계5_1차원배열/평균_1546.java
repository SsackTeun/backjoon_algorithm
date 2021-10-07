package 단계5_1차원배열;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;

public class 평균_1546 {
    public static double result(int[] score){
        //최댓값
        int maxScore = calMaxValue(score);

        //조작한 점수 넣기
        double[] modScore = new double[score.length];

        //최댓값 기준으로 점수 조작
        for(int i = 0 ; i < score.length; i++){
            modScore[i] = modifyScore(score[i], maxScore);
        }
        //평균 구하기
        double result = average(modScore);
        return result;
    }

    public static double average(double [] modScore){
        OptionalDouble opt = Arrays.stream(modScore).average();
        return opt.getAsDouble();
    }

    public static float modifyScore (int score, float maxScore){
        float modifyScore = score / maxScore * 100;
        return modifyScore;
    }

    public static int calMaxValue(int [] score){
        OptionalInt maxValue= Arrays.stream(score).max();
        return maxValue.getAsInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfSubject = sc.nextInt();

        int[] score = new int[numberOfSubject];

        for(int i = 0 ; i < score.length; i++){
            score[i] = sc.nextInt();
        }
        System.out.println(result(score));
    }
}
