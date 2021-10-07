package 단계3_for문;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class A더하기B_8_11022 {
    public static String plus(int c, int a, int b)
    {
        int plus = a + b;
        String result ="Case #"+ c + ": " + a + " + " + b + " = " + String.valueOf(plus);
        return result;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        int a, b = 0;
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 0; i < c ; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            arrayList.add(plus(i+1 ,a, b));
        }

        for (int i = 0; i < c; i ++){
            System.out.println(arrayList.get(i));
        }
    }
}
