package Test.Mondai4;

import java.util.Scanner;

public class Test4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0~100までの得点を（整数値）を2つ入力してください");
        System.out.print("国語の得点:");
        int x = sc.nextInt();

        System.out.print("英語の得点:");
        int y = sc.nextInt();

        if ((x == 100) && (y == 100)) {
            System.out.println("満点です");
        } else {
            System.out.println("");
        }
    }
}
