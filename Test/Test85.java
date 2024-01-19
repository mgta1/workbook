package Test;

public class Test85 {
    public static void main(String[] args) {
        // 仮の配列を作成
        int[] array = {1, 2, 3, 4, 5};

        // 変数sumに代入
        // forを使って合計値を出す
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // 合計値と平均値を表示
        System.out.println("合計値は" + sum + "です。");
        System.out.println("平均値は" + (double)(sum / array.length) + "です。");
    }
    
}
