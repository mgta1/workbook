// Scannerをインポート
import java.util.Scanner;

public class Kouka5 {
    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in);

        // score配列を生成
        int[] score = new int[5];

        // 5つの点数を繰り返し入力させる
        // 配列に格納
        for(int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "教科目の点数を入力してください:");
            score[i] = stdln.nextInt();
        }

        // sumに合計を格納
        int sum = 0;
        for(int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        // 合計点と平均点を表示
        System.out.println("合計点 = " + sum);
        System.out.println("平均点 = " + (double)(sum / score.length));
    }
}
