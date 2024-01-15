package Test;

import java.util.Scanner;

class Test91 {
    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in);
        String school = stdln.nextLine();
        String name = stdln.nextLine();

        play(school, name);
    }

    static void play(String school, String name) {
        System.out.println("学校名:" + school);
        System.out.println("名前:" + name);
    }
}