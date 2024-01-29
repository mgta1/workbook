package Test.Mondai14;

import java.util.Scanner;

public class T14_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("文字列を入力: ");
        String t = sc.nextLine();

        StringBuilder n = new StringBuilder();

        if (t.length() >= 11) {
            n.append(t.substring(0, 10));
        } else {
            n.append(t);
        }

        System.out.println("結果文字列: " + n.toString());
    }   
}