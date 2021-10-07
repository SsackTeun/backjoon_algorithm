package 단계8_기본_수학1;
import java.util.Scanner;
public class 달팽이는올라고가고싶다_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int An = sc.nextInt();
        int Bn = sc.nextInt();
        int V = sc.nextInt();
        System.out.println( (int)Math.ceil((double) (V-An) / (An - Bn)) + 1 );
    }
}
