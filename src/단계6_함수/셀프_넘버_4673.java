package 단계6_함수;

public class 셀프_넘버_4673 {
    public static int selfNumber(int number){
        int sum = 0;
        int saved = number;
        int result = number;
        //자릿수 ex _
       /*
        i = 1234
        n = i % 10 -> 4
        i = i / 10 -> 123

        n = i % 10 -> 3
        i = i / 10 -> 12 .....

        n = i % 10 -> 2
        i = i / 10 -> 1
       * */
        while(true){
            if(saved == 0){
                number = saved % 10;
                saved = saved / 10;
                sum += number;
                break;
            }else{
                number = saved % 10;
                saved = saved / 10;
                sum += number;
            }
        }
        //System.out.println("result : " + (result + sum));
        return result + sum;
    }


    public static void main(String[] args) {
        // 양의 정수 : n
        // d(75) = 75 + 7 + 5 = 87
        int n = 1;
        boolean array[] = new boolean[10001];

        for(int i = 1; i < array.length; i++){
            int num = selfNumber(i);
            if(num < array.length){
                array[num] = true;
            }
        }

        for (int i = 1; i < array.length; i++) {
            if(!array[i]){
                System.out.println(i);
            }
        }
    }
}
