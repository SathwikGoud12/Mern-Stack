import java.util.*;

public class ConvertBinaryToDecimal {
    static String display(int n) {
        String b = "";
        while (n >= 1) {
            int x = n % 2;
            n = n / 2;
            b = x + b;
        }
        return b;
    }

    static int display1(String b) {
        int result = 0;
        int powerof2 = 1;
        for (int i = b.length()- 1; i>= 0; i--) {
            if (b.charAt(i) == '1') {
                result = result + powerof2;
            }
            powerof2 = powerof2 * 2;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String b = display(n);
        System.out.println(display(n));
        System.out.println(display1(b));
    }
}
