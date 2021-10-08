package 단계7_문자열;

import java.util.Scanner;

public class 단어의갯수_1152 {

    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        s = s.trim();

        String[] sArray = s.split(" ");

        if(s.equals("")){
            System.out.println("0");
        }
        else{
            System.out.println(sArray.length);
        }
    }
}
