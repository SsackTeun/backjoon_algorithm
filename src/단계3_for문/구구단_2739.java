package 단계3_for문;
import java.util.Scanner;
public class 구구단_2739 {
    public static void main(String args[])
    {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        if( 2 <= i &&  i<= 9 )
        {
            for(int j = 1; j <= 9; j++ )
            {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
