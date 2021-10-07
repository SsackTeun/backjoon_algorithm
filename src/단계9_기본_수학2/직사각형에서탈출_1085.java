package 단계9_기본_수학2;

import java.util.Scanner;

public class 직사각형에서탈출_1085 {
    public static void routeFinder(int x, int y, int w, int h){
        int solution = 0;

        int x1 = x;
        int x2 = w - x;
        int rX = 0;

        int y1 = y;
        int y2 = h - y;
        int rY = 0;


        if(x1 > x2){
            rX = x2;
        }else{
            rX = x1;
        }

        if(y1 > y2){
            rY = y2;
        }else{
            rY = y1;
        }

        if(rX < rY){
            solution = rX;
        }else{
            solution = rY;
        }
        System.out.println(solution);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        routeFinder(x, y, w ,h);
    }
}
