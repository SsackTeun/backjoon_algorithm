package 단계4_while문;

import java.util.Scanner;

public class 더하기_사이클_1110 {
    /*
    0 보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때
    1) a < 10 ? a0으로 두 자리 수로 만들고, 각 자리의 숫자를 더함.
    2) 주어진수의 가장 오른쪽 수 + 구한 합의 가장 오른쪽 자리 수를 이어 붙임
     */
    public static int checkUnits(int input){
        if (input < 10){
            return input * 10;
        }
        else {
            return input;
        }
    }

    //합
    public static int getRightTerm(int input){
        int tens = input / 10;
        int units = input % 10;

        int sum = tens + units;
        return sum;
    }

    //오른쪽 숫자
    public static int getRightNumber(int input){
        if (input < 10){
            return input;

        }else{
            return input % 10;
        }
    }

    //새로운 숫자 만들기
    public static int makeNew(int left, int right){
        int leftS = getRightNumber(left);
        int rightS = getRightNumber(right);
        return leftS * 10 + rightS;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int save = input;
        int result = -1;
        int count = 0;

        while(true){
            if (result == save) {break;}
            int number = checkUnits(input);
            //System.out.println("number : " + number);

            int right = getRightTerm(number);
            //System.out.println("right : " + right);

            int left = getRightNumber(input);
            //System.out.println("left : " + left);

            result = makeNew(left, right);
            input = result;
            //System.out.println(input);
            count ++;
        }
        System.out.println(count);
    }
}
