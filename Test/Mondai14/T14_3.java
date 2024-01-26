package Test.Mondai14;

import java.util.Scanner;

public class T14_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("文字列を入力:");
        String s = stdIn.nextLine();

        System.out.println("結果文字列 : " + s.substring(0, 10));
    }
}

