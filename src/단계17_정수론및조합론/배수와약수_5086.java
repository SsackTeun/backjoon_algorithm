package 단계17_정수론및조합론;

import java.util.Scanner;

public class 배수와약수_5086 {
    // 약수 나누어서 떨어지면 a % b = 0
    // 첫 번째 수가 두 번째 수의 약수라면
    // 첫 번째 수 < 두 번째 수
    public static int factor(int a, int b){
        int result = 0;
        if (b % a == 0){
            System.out.println("factor");
        }
        else{
            result = 1;
        }
        return result;
    }

    // 배수
    public static int multiple(int a, int b){
        int result = 0;
        if ( a % b == 0){
            System.out.println("multiple");
        }
        else{
            result = 1;
        }
        return result;
    }

    //둘다 x
    public static void neither(int factor, int multiple){
        if(factor + multiple == 2){
            System.out.println("neither");
        }
    }

    public static void checker(int a, int b){
        int sum = 0;
        int f = 0;
        int m = 0;
        f = factor(a, b);
        m = multiple(a, b);
        neither(f, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) break;
            checker(a, b);
        }
    }
}
