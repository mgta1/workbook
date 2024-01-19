package Test.Mondai11;

import java.util.Scanner;
import Test.Mondai11.Test11_3Xy_sum;

public class Test11_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();
        Test11_3Xy_sum xy_sum = new Test11_3Xy_sum(x, y);

        int sum = xy_sum.xy_total_value();
        System.out.println(x + "から" + y + "までの合計値は" + sum + "です。");

    }
}
