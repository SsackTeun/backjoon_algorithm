package 단계2_if문;

import java.io.IOException;
import java.util.Scanner;

public class 사분면_고르기_14681 {
    public static int selectQuadrant(int x, int y){
        int result = -1;
        if (x > 0 && y > 0) {result = 1;}
        if (x < 0 && y > 0) {result = 2;}
        if (x < 0 && y < 0) {result = 3;}
        if (x > 0 && y < 0) {result = 4;}
        return result;
    }

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println(selectQuadrant(x, y));
    }
}
