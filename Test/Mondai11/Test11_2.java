package Test.Mondai11;

import java.util.Scanner;
import Test.Mondai11.Test11_2Xy_sum;

public class Test11_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Test11_2Xy_sum.x = stdIn.nextInt();
        Test11_2Xy_sum.y = stdIn.nextInt();

        int sum = Test11_2Xy_sum.test11_2Xy_sum();
        System.out.println(Test11_2Xy_sum.x + "から" + Test11_2Xy_sum.y + "までの合計値は" + sum + "です。");
    }
}
