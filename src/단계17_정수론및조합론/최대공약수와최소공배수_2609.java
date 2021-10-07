package 단계17_정수론및조합론;
import java.util.Scanner;

public class 최대공약수와최소공배수_2609 {
    public static int greatest_common_factor(int a, int b){
        int A = a;
        int B = b;
        int r = a % b;

        if( r == 0)
            return B;

        int res = greatest_common_factor(B , r);

        return res;
    }

    public static int least_common_multiple(int ab, int greatest_common_factor){
        return ab / greatest_common_factor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int greatest_common_factor = greatest_common_factor(a, b);
        int least_common_multiple = least_common_multiple(a*b,greatest_common_factor);
        System.out.println(greatest_common_factor);
        System.out.println(least_common_multiple);
    }
}
