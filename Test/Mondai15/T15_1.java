package Test.Mondai15;

import java.util.Scanner;

public class T15_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数1 = ");
        int x = stdIn.nextInt();
        System.out.print("整数2 = ");
        int y = stdIn.nextInt();
        
        try{
            System.out.println(x + " / " + y + " = " + (double)(x / y));
            System.out.println("処理終了");
        } catch (ArithmeticException e) {
            System.out.println("0による割り算です!!");
            System.out.println("処理終了");
        }
    }   
}
