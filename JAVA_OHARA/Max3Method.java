import java.util.Scanner;

class Max3Method {
    static int max(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in);
        
        System.out.print("整数a:"); int a = stdln.nextInt();
        System.out.print("整数b:"); int b = stdln.nextInt();
        System.out.print("整数c:"); int c = stdln.nextInt();

        System.out.println("最大値は" + max(a, b, c, 5) + "です。");
    }
}