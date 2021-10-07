package 단계5_1차원배열;

import java.util.Scanner;

public class OX퀴즈_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();

        while(test > 0){
            char[] quizAnswers = sc.nextLine().toCharArray();
            int sum = 0;
            int result = 0;

            for(int i = 0; i < quizAnswers.length; i++){
                if (quizAnswers[i] == 'O'){
                    sum = sum + 1;
                    result += sum;
                }else{
                    sum = 0;
                    result += sum;
                }
            }
            System.out.println(result);
            test --;
        }
    }
}
