package Test.Mondai12;

class Test12_2Person {
    String name;
    String job;

    Test12_2Person(String name, String job){
        this.name = name; this.job = job;
    }

    public void introduce() {
        System.out.println("氏名: " + name);
        System.out.println("職業: " + job);
    }
}

public class Test12_2PersonMain {
    public static void main(String[] args) {
        Test12_2Teacher info1 = new Test12_2Teacher("近藤勇", "教員", "Go 言語");
        Test12_2Cook info2 = new Test12_2Cook("沖田総司", "シェフ", "オムライス");

        info1.introduce();
        System.out.println("");
        info2.introduce();
    }
}