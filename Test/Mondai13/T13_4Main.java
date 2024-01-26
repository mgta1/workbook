package Test.Mondai13;

// Scannerをインポート
import java.util.Scanner;

public class T13_4Main {
    public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    // ２つの数値を入力させる
    System.out.print("1個目の整数を入力してください:");
    int num1 = stdIn.nextInt();

    System.out.print("2個目の整数を入力してください:");
    int num2 = stdIn.nextInt();

    // インスタンスを生成
    T13_4CalcExcuter a = new T13_4CalcExcuter(num1, num2);

    // 画面に表示
    // インスタンス化したオブジェクトを使用
    System.out.println("足し算の結果: " + a.dispAdd()); 
    System.out.println("引き算の結果: " + a.dispSub()); 
    System.out.println("掛け算の結果: " + a.dispMulti()); 
    System.out.println("割り算の結果: " + a.dispdiv()); 
    }
}