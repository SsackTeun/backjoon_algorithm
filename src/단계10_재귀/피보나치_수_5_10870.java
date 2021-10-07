package 단계10_재귀;

import java.util.Scanner;

public class 피보나치_수_5_10870 {
    public static void Fibonacci_numbers(int count)
    {
        int number = 0;
        int n = 0;
        // +1 한 이유는 예제에서 10일 때, 34 가 아닌 55로 0을 포함하지않고 1부터 시작
        int[] fibonacci = new int[count+1];

        if(count == 0){
            fibonacci[0] = 0;
        }

        if(count == 1){
            fibonacci[0] = 0;
            fibonacci[1] = 1;
        }

        if(count >= 2){
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            for(int i = 2; i < fibonacci.length; i++){
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
        }
        System.out.println(fibonacci[fibonacci.length -1]);
    }

    public static void main(String[] args) {
        int count = new Scanner(System.in).nextInt();
        Fibonacci_numbers(count);
    }
}
