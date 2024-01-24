package Test.Mondai11;

public class Test11_7Student {
    private String name;
    private String student_number;
    private int japanese;
    private int math;
    private int english;

    public Test11_7Student(String name, String student_number, int japanese, int math, int english) {
        this.name = name; this.student_number = student_number;
        this.japanese = japanese; this.math = math; this.english = english;
    }

    String getName() {
        return name;
    }

    String getStudent_number() {
        return student_number;
    }

    public double average_point() {
        int total = japanese + math + english;
        return (double) total / 3;
    }

    public int total_point() {
        return japanese + math + english;
    }
}
