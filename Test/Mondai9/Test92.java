package Test.Mondai9;

import java.util.Scanner;

public class Test92 {
    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in);
        String Hello = stdln.nextLine();

        play(Hello);
    }

    static void play(String Hello) {
        for(int i = 0; i < 10; i++) {
            System.out.println(Hello);
        }
    }

}
