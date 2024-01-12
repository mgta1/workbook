package Test;
import java.util.Scanner;

class Test73 {
    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in);
        int n;
        do {
            System.out.print("整数値を入力:");
            n = stdln.nextInt();
        } while (n <= 0);

        while (n > 0) {
            System.out.print(n % 10);
            n /= 10;
        }
        System.out.print(n);
    }
}