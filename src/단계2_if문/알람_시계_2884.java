package 단계2_if문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알람_시계_2884 {
    public static void alarm (int t, int m){
        // 1) 시간이 바뀌는 경우
        // 1. 45분 미만
        // 2. 45분 미만이면서 0시 인경우 23시

        // 2) 시간이 안바뀌는 경우
        // 1. 45분 이상
        // 2. 입력된 시간 - 45
        if (t >= 0 && m > 45){
            t = t;
            m = m - 45;
        }
        else if (t > 0 && m > 45){
            t = t;
            m = m - 45;
        }
        else if (t > 0 && m < 45){
            t = t - 1;
            m = m + 60 - 45;
        }else if (t == 0 && m < 45){
            t = 23;
            m = m + 60 - 45;
        }else if (m == 45){
            t = t;
            m = 0;
        }

        System.out.println(t + " " + m);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        alarm(t, m);
    }
}
