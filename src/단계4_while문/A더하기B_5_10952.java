package 단계4_while문;

import java.util.Scanner;

public class A더하기B_5_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(a+b);
        }
    }
}
