package Test;
import java.util.Scanner;

class Test10 {
    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in);
        System.out.println("文字の入力:");
        String str = stdln.next();
        System.out.println("整数の入力:");
        int x = stdln.nextInt();
        System.out.println("小数の入力:");
        float y = stdln.nextFloat();
        System.out.println("入力された文字=" + str);
        System.out.println("入力された整数=" + x);
        System.out.println("入力された小数=" + y);
    }
}