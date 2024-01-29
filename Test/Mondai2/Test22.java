package Test.Mondai2;

public class Test22 {
    public static void main(String[] args) {
        double x = 10.0;
        String y = "10";
        String z = "十";

        int numx = (int) Math.round(x);
        int numy = Integer.parseInt(y);
        int numz = Integer.parseInt(z);

        System.out.println(numx);
        System.out.println(numy);
        System.out.println(numz);

    }
}