package Test.Mondai11;

class Test11_3Xy_sum {
    public int x;
    public int y;

    public Test11_3Xy_sum(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int xy_total_value() {
        int sum = 0;
        for(int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
}