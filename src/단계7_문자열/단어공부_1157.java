package 단계7_문자열;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class 단어공부_1157 {

    public static String UpperCase(String word) {
        return word.toUpperCase();
    }

    public static void main(String[] args) {
        String word = "Mississipi";
        word = UpperCase(word);

        HashSet<String> words = new HashSet<>();

        //문자 분리 -> SET에 담아 중복제거
        for (int i = 0; i < word.length(); i++) {
            words.add(word.charAt(i) + "".trim());
        }

        HashMap<String, Integer> result = new HashMap<>();


        //카운트
        for (String i : words) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (i.charAt(0) == word.charAt(j)) {
                    count++;
                }
            }
            result.put(i, count);
        }

        int max = 0;
        int tmp = 0;

        for(Map.Entry<String,Integer> i : result.entrySet()){
            tmp = i.getValue();
            if(max <= tmp){
                max = tmp;
                //System.out.println("max : " + max);
            }
        }

        int count = 0;
        for(Map.Entry<String, Integer> wd : result.entrySet()){
            if(max == wd.getValue()){
                count++;
                if(count >= 2) {
                    System.out.println("?");
                    break;
                }
            }
        }
    }
}
