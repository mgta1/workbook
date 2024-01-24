package Test.Mondai11;

import Test.Mondai11.Test11_7Student;

public class Test11_7 {
    public static void main(String[] args) {
        Test11_7Student asan = new Test11_7Student("Aさん", "001番", 89, 65, 88);
        Test11_7Student bsan = new Test11_7Student("Bさん", "002番", 80, 95, 64);
        Test11_7Student csan = new Test11_7Student("Cさん", "003番", 70, 80, 98);

        double ave1 = asan.average_point();
        double ave2 = bsan.average_point();
        double ave3 = csan.average_point();

        System.out.println(asan.getStudent_number() + asan.getName() + "平均点" + ave1);
        System.out.println(bsan.getStudent_number() + bsan.getName() + "平均点" + ave2);
        System.out.println(csan.getStudent_number() + csan.getName() + "平均点" + ave3);
    }
}
