package 단계3_for문;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class X보다_작은_수_10871 {
    //정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
    //이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

    //첫째 줄에 N과 X가 주어진다 (1 <= N, X<= 10000)
    //둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10000 보다 작거나 같은 정수이다

    //출력 : X 보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다

    public static ArrayList<Integer> lessThan(int X, int[] array){

        int lessThan = X;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < array.length; i++){
            if( lessThan > array[i])
            {
                result.add(array[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] numbers = new int[N];


        int input = 0;

        for(int i = 0 ; i < N; i ++){
            input = sc.nextInt();
            numbers[i] = input;
        }

        ArrayList<Integer> result = lessThan(X, numbers);

        result.forEach(e -> {
            System.out.print(e + " ");
        });
    }
}
