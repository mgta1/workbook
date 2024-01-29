package Test.Mondai4;

import java.util.Scanner;

public class Test4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("0~100までの得点を（整数値）を入力してください:");
        int t = sc.nextInt();

        if (t >= 80) {
            System.out.println("合格です");
        } else {
            System.out.println("");
        }
    }
}
