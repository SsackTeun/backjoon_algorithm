package 단계7_문자열;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 숫자의_합_11720 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n1= 0 , sum = 0;

        n1 = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();

        for(int i = 0; i < n1; i++)
        {
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
