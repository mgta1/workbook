package Test.Mondai13;

class T13_4CalcExcuter implements T13_4CalcAddSub, T13_4CalcMultiDiv {
    int num1;
    int num2;

    T13_4CalcExcuter(int num1, int num2) {
        this.num1 = num1; this.num2 = num2;
    }

    @Override public int dispAdd() {
        int sum = num1 + num2;
        return sum;
    }

    @Override public int dispSub() {
        int ave = num1 - num2;
        return ave;
    }

    @Override public int dispMulti() {
        int multi = num1 * num2;
        return multi;
    }

    @Override public int dispdiv() {
        int div = num1 / num2;
        return div;
    }
}