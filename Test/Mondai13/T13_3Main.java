package Test.Mondai13;

public class T13_3Main {
    public static void main(String[] args) {
        T13_3Person[] a = new T13_3Person[2];
        a[0] = new T13_3Teacher("竹井一馬", "教員", "情報処理");
        a[1] = new T13_3Cook("大原太郎", "シェフ", "オムライス");

        for (T13_3Person p : a) {
            p.introduce();
            System.out.println("");
        }
    }
}
