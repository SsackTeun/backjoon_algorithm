package 단계8_기본_수학1;

import java.util.Scanner;

public class 손익분기점_1712 {
    /*
     * 고정 비용 : A
     * 가변 비용 : B
     * 생산비 : 노트북 한대 1070만 10대 1700만
     * 노트북 가격 : n 일 때 손익 분기점
     *
     * A + (B * n) < 노트북가격*ns
     * A B C 가 주어질 때, ..
     * */

    public static int product(int fixed, int variable, int price){
        //생산비
        if((price - variable) == 0) return -1;

        int leftTerm = fixed / (price - variable);
        int rightTerm = 1;

        while(true){
            if(price < variable){
                return -1;
            }else{
                if(leftTerm < rightTerm){
                    return rightTerm;
                }
            }
            rightTerm++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fixed = sc.nextInt();
        int variable = sc.nextInt();
        int price = sc.nextInt();

        //product(fixed, variable, price);
        System.out.println(product(fixed, variable, price));
    }
}
