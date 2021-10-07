package 단계2_if문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 두_수_비교하기_1330 {
        public static 두_수_비교하기_1330 두_수_비교하기_1330(){
            return new 두_수_비교하기_1330();
        }

        public static String compareWith(int a, int b){
            String result = null;
            if (a > b){result = ">";}
            if (a < b){result = "<";}
            if (a == b){result = "==";}
            return result;
        }
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(compareWith(a, b));
        }
    }

