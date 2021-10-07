package 단계3_for문;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class A더하기B_3_10950 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        int a, b = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < c ; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            arrayList.add(a + b);
        }

        for (int i = 0; i < c; i ++){
            System.out.println(arrayList.get(i));
        }
    }
}
