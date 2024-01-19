package Test.Mondai11;

class Test11_2Xy_sum {
    public static int x;
    public static int y;

    public static int test11_2Xy_sum() {
        int sum = 0;
        for(int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
}