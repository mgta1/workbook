package Test.Mondai12;
import java.util.Scanner;

class Calculator {
    int x;
    int y;

    Calculator(int x, int y) {
        this.x = x; this.y = y;
    }

    public int CalcSum() {
        int sum = x + y;
        return sum;
    }

    public int CalcAve() {
        int ave = x + y / 2;
        return ave;
    }
}

class MoreCalc extends Calculator {

    MoreCalc(int x, int y) {
        super(x, y);
    }
    public int CalcPow() {
        int pow = 1;
        for(int i = 1; i <= y; i++) {
            pow *= x;
        }
        return pow;
    }
}

public class Test12_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数を入力してください:");
        int x = stdIn.nextInt();

        System.out.print("整数を入力してください:");
        int y = stdIn.nextInt();

        MoreCalc morecalc = new MoreCalc(x, y);

        System.out.println("Sum " + x + " and " + y + " = " + morecalc.CalcSum());
        System.out.println("Average " + x + " and " + y + " = " + morecalc.CalcAve());
        System.out.println("Power " + x + " of " + y + " = " + morecalc.CalcPow());
    }
}
