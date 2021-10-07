package 단계6_함수;

public class 정수_N개의_합_15596 {
    public class Test {
        long sum(int[] a) {
            long ans = 0;
            for(int i = 0; i < a.length; i++){
                ans += a[i];
            }
            return ans;
        }
    }
}
