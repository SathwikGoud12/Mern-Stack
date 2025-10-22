import java.util.Scanner;

public class SetBit_count {

    public static int setbits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println("Number of set bits: " + setbits(sc.nextInt()));
        sc.close();
    }
}
