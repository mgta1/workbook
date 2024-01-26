package Test.Mondai14;

import java.util.Scanner;

public class T14_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("文字列を入力:");
        String s = stdIn.nextLine();

        System.out.println("入力された文字数は" + s.length() + "です。");
    }
}
