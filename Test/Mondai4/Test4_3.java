package Test.Mondai4;

import java.util.Scanner;

public class Test4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0~100までの得点（整数値）を2つ入力してください");
        System.out.print("国語の得点:");
        int x = sc.nextInt();

        System.out.print("英語の得点:");
        int y = sc.nextInt();

        if ((x >= 80) && (y >= 80)) {
            System.out.println("2科目とも合格です");
        } else {
            System.out.println("");
        }
    }
}
