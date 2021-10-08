package 단계7_문자열;

import java.util.Scanner;

public class 그룹단어체커_1316 {

    public static int groupChecker(String word){



        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int chkCounter = 0;
        for (int i = 0; i < cnt; i++) {
            chkCounter = groupChecker(sc.nextLine());
        }
    }
}
