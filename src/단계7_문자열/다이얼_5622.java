package 단계7_문자열;

import java.util.Scanner;

public class 다이얼_5622 {
    public static String[] wordChangeToNumber(String word){
        String numberString = "";
        char[] ch = word.toCharArray();
        String[] str = new String[ch.length];

        for (int i = 0; i < ch.length; i++) {
            str[i] = String.valueOf(ch[i]);
        }

        for(int i = 0; i < str.length; i++){
            word = str[i];
            if(word.contains("A") || word.contains("B") || word.contains("C")){
                str[i] = "2";
            }
            if(word.contains("D") || word.contains("E") || word.contains("F")){
                str[i] = "3";
            }
            if(word.contains("G") || word.contains("H") || word.contains("I")){
                str[i] = "4";
            }
            if(word.contains("J") || word.contains("K") || word.contains("L")){
                str[i] = "5";
            }
            if(word.contains("M") || word.contains("N") || word.contains("O")){
                str[i] = "6";
            }
            if(word.contains("P") || word.contains("Q") || word.contains("R") || word.contains("S")){
                str[i] = "7";
            }
            if(word.contains("T") || word.contains("U") || word.contains("V")){
                str[i] = "8";
            }
            if(word.contains("W") || word.contains("X") || word.contains("Y") || word.contains("Z")){
                str[i] = "9";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] word = wordChangeToNumber(str);

        int result = 0;
        for (String s : word) {
            result += Integer.parseInt(s) + 1;
        }
        System.out.println(result);
    }
}
