package Test.Mondai13;

//-----AddSubとMultiDivの2つインターフェイスを実装-----//
class T13_4CalcExcuter implements T13_4CalcAddSub, T13_4CalcMultiDiv {
    int num1;
    int num2;

    // コンストラクタ
    T13_4CalcExcuter(int num1, int num2) {
        this.num1 = num1; this.num2 = num2;
    }

    // ２つの値の足し算を求める
    @Override public int dispAdd() {
        int sum = num1 + num2;
        return sum;
    }

    // 2つ値の引き算を求める
    @Override public int dispSub() {
        int ave = num1 - num2;
        return ave;
    }

    // 2つの値の掛け算を求める
    @Override public int dispMulti() {
        int multi = num1 * num2;
        return multi;
    }

    // 2つ値の割り算を求める
    @Override public int dispdiv() {
        int div = num1 / num2;
        return div;
    }
}