package Test.Mondai3;

import java.util.Scanner;

public class Test3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("長方形の長さを求めます");

        System.out.print("縦の長さ:");
        int vertical = sc.nextInt();

        System.out.print("横の長さ:");
        int horizontal = sc.nextInt();
        
        double area = vertical * horizontal;

        System.out.println("長方形の面積 = " + area);
    }
}
