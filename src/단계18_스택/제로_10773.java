package 단계18_스택;

import java.util.ArrayList;
import java.util.Scanner;

public class 제로_10773 {
    public static ArrayList<Integer> delete(ArrayList<Integer> arrayList){
        ArrayList<Integer> delete = arrayList;
        delete.remove(delete.size()-1);
        return delete;
    }

    public static ArrayList<Integer> add(ArrayList<Integer> arrayList, int addNumber){
        ArrayList<Integer> add = arrayList;
        add.add(addNumber);
        return add;
    }

    public static int ArraySum(ArrayList<Integer> arrayList){

        return arrayList
                .stream()
                .mapToInt(e->e)
                .sum();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //라인 수
        int K = sc.nextInt();

        //ArrayList : 순서보장, LinkedList 보다 순차 추가 는 빠름
        ArrayList<Integer> numbers = new ArrayList<>();

        //입력을 받자 숫자 K개
        while(K > 0){
            //숫자 입력받기
            int num = sc.nextInt();
            int delete = 0;

            if(num == delete){
                numbers = delete(numbers);
            }
            else{
                numbers = add(numbers, num);
            }
            K--;
        }
        System.out.println(ArraySum(numbers));
    }
}
