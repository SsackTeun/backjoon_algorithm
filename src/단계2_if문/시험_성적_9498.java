package 단계2_if문;
import java.util.Scanner;

public class 시험_성적_9498 {
    public static void main(String args[])
    {
        int i = 0;

        Scanner scan = new Scanner(System.in);

        i = scan.nextInt();

        if(i <= 100 && i >= 90)
        {
            System.out.println("A");
        }

        if(i >= 80 &&  i <= 89)
        {
            System.out.println("B");
        }

        if( i >= 70 && i <= 79)
        {
            System.out.println("C");
        }

        if( i >= 60 && i <= 69)
        {
            System.out.println("D");
        }

        if( i < 60)
        {
            System.out.println("F");
        }
    }
}
