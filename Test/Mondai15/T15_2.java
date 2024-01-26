package Test.Mondai15;

import java.util.Scanner;
import java.util.InputMismatchException;

public class T15_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        try{
            System.out.print("整数を入力 = ");
            int x = stdIn.nextInt();

            if (x % 2 == 0) {
                System.out.println(x + "は偶数");
            } else {
                System.out.println(x + "は奇数");
            }
        } catch (InputMismatchException e) {
            System.out.println("整数と認識できません!!");
        }
    }
}
