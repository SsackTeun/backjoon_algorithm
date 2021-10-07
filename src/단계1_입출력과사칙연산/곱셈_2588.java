package 단계1_입출력과사칙연산;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 곱셈_2588 {

    public static 곱셈_2588 곱셈_2588() {
        return new 곱셈_2588();
    }

    public int multiplication(int p, int q) {
        return p * q;
    }

    public int units(int q) {
        return (q % 100) % 10;
    }

    public int tens(int q) {
        return (q % 100) / 10;
    }

    public int hundreds(int q) {
        return q / 100;
    }

    public static int StringtoInteger(String p) {
        return Integer.parseInt(p);
    }

    public static int sum(int p, int q, int r) {
        return p + (q * 10) + (r * 100);
    }

    public static void main(String[] args) throws IOException {
        곱셈_2588 main = 곱셈_2588();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String p = br.readLine();
        String q = br.readLine();

        int units = main.multiplication(StringtoInteger(p), main.units(StringtoInteger(q)));
        int tens = main.multiplication(StringtoInteger(p), main.tens(StringtoInteger(q)));
        int hundreds = main.multiplication(StringtoInteger(p), main.hundreds(StringtoInteger(q)));

        System.out.println(units);
        System.out.println(tens);
        System.out.println(hundreds);
        System.out.println(sum(units, tens, hundreds));
    }
}
