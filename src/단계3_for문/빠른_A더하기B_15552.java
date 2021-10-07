package 단계3_for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 빠른_A더하기B_15552 {
    public static void main(String[] args)
    {

        //bufferedReader 선언
        BufferedReader bf = null;
        bf = new BufferedReader(new InputStreamReader(System.in));

        //bufferedWriter 선언
        BufferedWriter bw = null;
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //반복
        int count = 0;

        StringTokenizer strToken;

        //입력 받을 횟수 입력 받기
        try
        {
            count = Integer.parseInt( bf.readLine() );
            //입력한 만큼 반복시킴
            while(count > 0)
            {
                strToken = new StringTokenizer(bf.readLine());

                //한줄을 읽어서 공백으로 잘라서 넣음
                int a = Integer.parseInt(strToken.nextToken());
                int b = Integer.parseInt(strToken.nextToken());

                //더해줌
                int result = a+b;

                //출력
                bw.write(result + "\n");
                count--;
            }
            bw.flush();
        }
        catch (NumberFormatException | IOException e)
        {
            e.printStackTrace();
        }
    }
}
