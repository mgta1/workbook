package Test.Mondai14;

class StringBuilder {
    String s;
    String n;

    StringBuilder(String s, String n) {
        this.s = s; this.n = n;
    }

    public String sn() {
        return s + n;
    }

}

public class T14_5 {
    public static void main(String[] args) {
        StringBuilder s_n = new StringBuilder("東京都千代田区", "神田神保町");
        s_n.sn();
    }
}
