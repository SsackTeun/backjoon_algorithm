package 단계11_브루트포스;

import java.util.Scanner;

public class 덩치_7568 {

    public static int[] grade(int[][] size, int count) {

        int weight = 0;
        int tall = 0;
        int[] grade = new int[count];

        for (int i = 0; i < count; i++) {
            weight = size[i][0];
            tall = size[i][1];
            grade[i] = 1;

            //System.out.println("[weight] : " + weight + " \n[tall] : " + tall + "\n[grade] : " + grade[i] );

            for (int j = 0; j < count; j++) {
                if(weight == size[j][0] && tall == size[j][1]){
                    //skip
                }else if(weight < size[j][0] && tall < size[j][1]){
                    // 현재 사람보다 덩치가 나중사람이 클때
                    // 등수 밀려남
                    grade[i] = grade[i] + 1;
                }
            }
        }
        return grade;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        //이차원 배열 n 행 , 2열
        int[][] size = new int[total][2];

        for (int i = 0; i < total; i++) {
            for (int j = 0; j < 2; j++) {
                size[i][j] = sc.nextInt();
            }
        }

        int result[] = grade(size, total);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
