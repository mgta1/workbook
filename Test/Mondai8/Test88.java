package Test.Mondai8;
// Scnnerをインポート
import java.util.Scanner;

public class Test88 {
    public static void main(String[] args) {
        // ScannerをSystem.inで使えるようにする
        Scanner stdln = new Scanner(System.in);
        // x配列を作成
        int[] x = new int[3];
        
        // 3つの整数値を入力させる
        for(int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "つ目の整数値:");
            x[i] = stdln.nextInt();
        }

        // 最大値の変数と最小値の変数
        int Max = x[0];
        int Min = x[0];

        // 最大値と最小値を出す
        for(int i = 1; i < x.length; i++) {
            if(Max < x[i]) {
                Max = x[i];

            } else if (Min > x[i]) {
                Min = x[i];
            }
        }

        // 最大値と最大値を表示
        System.out.println("最大値:" + Max);
        System.out.println("最小値:" + Min);
    }
}
