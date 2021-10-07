package 단계2_if문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 윤년_2753 {
    public static int cal(int years){
        int result = -1;

        if(years % 4 == 0 && years % 100 != 0 || years % 400 == 0 ){
            result = 1;
        }
        else
        {
            result = 0;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int years = cal(input);
        System.out.println(years);
    }
}
