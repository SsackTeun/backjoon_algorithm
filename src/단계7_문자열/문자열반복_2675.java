package 단계7_문자열;

import java.util.Scanner;

public class 문자열반복_2675 {

    public static String StringRepeater(String S, int n){

        String newString = "";
        for (int i = 0; i < S.length(); i++) {
            //System.out.println("문자[" + S.charAt(i) + "]" + "[" + i +"]");

            for (int j = 0; j < n; j++) {
                newString = newString + S.charAt(i);
                //System.out.println(newString);
            }
        }
        return newString.trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //테스트 케이스 갯수
        int testCases = sc.nextInt();

        while(testCases > 0){
            //각 문자를 R번 반복해
            int counts = sc.nextInt();

            //문자열 S 를 입력 받은 후
            String S = sc.nextLine();

            //새 문자열 P를 만든 후 출력
            String newString = "";

            //1. 테스트 케이스은 문자열에 저장이된다.
            //2. 테스트 케이스의 총 인덱스 갯수 만큼 배열을 추가로 생성한다.
            //3. 테스트 케이스의 R 만큼 반복한다.
            String result = StringRepeater(S, counts);
            System.out.println(result);
            testCases--;
        }
    }
}
