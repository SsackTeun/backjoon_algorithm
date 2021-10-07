package 단계9_기본_수학2;
import java.util.Scanner;
public class 네번째점_3009 {
    public static void input(int x1, int x2, int x3, int y1, int y2, int y3){

        int outX = 0, outY = 0;

        if(x1 == x2){
            //x3
            outX = x3;
        }

        if(x2 == x3){
            //x1
            outX = x1;
        }

        if(x3 == x1){
            //x2
            outX = x2;
        }

        if(y1 == y2){
            //y3
            outY = y3;
        }

        if(y2 == y3){
            //y1
            outY = y1;
        }

        if(y3 == y1){
            //y2
            outY = y2;
        }
        System.out.println(outX + " " + outY);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        input(x1,x2,x3,y1,y2,y3);
    }
}
