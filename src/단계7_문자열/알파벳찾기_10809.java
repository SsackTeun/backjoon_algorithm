package 단계7_문자열;

import java.util.Scanner;

public class 알파벳찾기_10809 {
    public static void main(String[] args) {
        String word = new Scanner(System.in).nextLine();
        char[] alphabat = new char[26];
        int[] alphabatNum = new int[26];

        for (int i = 0; i < alphabat.length; i++) {
            alphabat[i] = (char)(97+i);
        }

        for (int i = 0; i < alphabatNum.length; i++) {
            alphabatNum[i] = -1;
        }

        for (int i = 0; i < word.length(); i++) {
            //word에서 꺼낸 알파벳 ( word = "test" )
            //System.out.println("알파벳 [" + word.charAt(i) + "]의 인덱스는 " + i + " 이며");
            for (int j = 0; j < alphabat.length; j++) {
                //System.out.println("현재 순환중인 알파벳은 " + "[" + alphabat[j] + "] 입니다" );
                if(word.charAt(i) == alphabat[j] && alphabatNum[j] == -1){
                    //System.out.println("찾았습니다." + alphabat[j]);
                    alphabatNum[j] = i;
                }
            }
        }

        for (int i = 0; i < alphabatNum.length; i++) {
            System.out.print(alphabatNum[i] + " ");
        }
    }
}
