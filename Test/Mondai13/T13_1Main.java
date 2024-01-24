package Test.Mondai13;

public class T13_1Main {
    public static void main(String[] args) {
        T13_1Teacher info1 = new T13_1Teacher("竹井一馬", "教員", "情報処理");
        T13_1Cook info2 = new T13_1Cook("大原太郎", "シェフ", "オムライス");

        info1.introduce();
        System.out.println("");
        info2.introduce();
    }
}
