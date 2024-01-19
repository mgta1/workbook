package Test;

// Scannerをインポート
import java.util.Scanner;

public class Test51 {
    public static void main(String[] args) {
        // System.inでScannerを使えるようにする
        Scanner stdln = new Scanner(System.in);

        // A~Dの値を入力させる
        System.out.print("A~Dの値を入力してください:");
        String x = stdln.nextLine();

        // swichで条件を判定する
        // 入力された結果に応じて画面に表示する
        switch (x) {
            case "A" : System.out.print("ランクAは評価「優」です");
            break;
            case "B" : System.out.print("ランクBは評価「良」です");
            break;
            case "C" : System.out.print("ランクCは評価「可」です");
            break;
            case "D" : System.out.print("ランクDは評価「不可」です");
            break;
        }
    }
}
