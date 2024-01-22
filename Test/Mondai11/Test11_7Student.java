package Test.Mondai11;

public class Test11_7Student {
    private String name;
    private int student_number;
    private int japanese;
    private int math;
    private int english;

    public Test11_7Student(String name, int student_number, int japanese, int math, int english) {
        this.name = name; this.student_number = student_number;
        this.japanese = japanese; this.math = math; this.english = english;
    }

    public double average_point() {
        int total = japanese + math + english;
        total /= 3;
    }
}
