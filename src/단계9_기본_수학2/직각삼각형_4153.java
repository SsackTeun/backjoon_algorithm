package 단계9_기본_수학2;
import java.util.Scanner;

public class 직각삼각형_4153 {
    public static void rect(int a, int b, int c){
        if(a < b && b < c){
            if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }else if(a < c && c < b){
            if(Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }else if(b < a && a < c){
            if(Math.pow(b,2) + Math.pow(a,2) == Math.pow(c,2)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }else if(b < c && c < a){
            if(Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }else if(c < a && a < b){
            if(Math.pow(c,2) + Math.pow(a,2) == Math.pow(b,2)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }else if(c < b && b < a){
            if(Math.pow(c,2) + Math.pow(b,2) == Math.pow(a,2)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a == 0 && b == 0 && c ==0) break;
            rect(a, b, c);
        }
    }
}
