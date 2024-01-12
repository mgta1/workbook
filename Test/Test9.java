package Test;
import java.util.Scanner;

class Test9 {
    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in,"shift-jis");
        
        System.out.println("お名前を入力してください>");
        String str = stdln.next();

        System.out.println("こんにちは" + str + "さん！");
    }
}