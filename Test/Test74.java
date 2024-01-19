package Test;

public class Test74 {
    public static void main(String[] args) {
        // total n 変数に代入
        int total = 0;
        int n = 0;

        // while文を使って100000を超えた場合処理を終了
        // 100000を超えるまで変数nに+1する
        while (total <= 100000) {
            n++;
            total += n;
        }
        // 結果を表示
        System.out.println("合計が100000を超えるnは" + n + "です");
    }
}
