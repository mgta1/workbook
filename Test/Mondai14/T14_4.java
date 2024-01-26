package Test.Mondai14;

import java.util.Scanner;

public class T14_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("1つ目の文字列を入力:");
        String s = stdIn.nextLine();

        System.out.print("2つ目の文字列を入力:");
        String n = stdIn.nextLine();

        int idx = s.indexOf(n);
        if (idx == -1) {
            System.out.println("違う文字列です。");
        } else
        System.out.println("同じ文字列です。");
    }
}
