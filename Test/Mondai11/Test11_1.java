package Test.Mondai11;

import java.util.Scanner;

class Circle {
    public double radius;
    public double PI = 3.1415;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double circumference(double radius) {
        return 2 * PI * radius;
    }
    public double area(double radius) {
        return radius * radius * PI;
    }
}    
public class Test11_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("半径を整数値で入力:");
        double radius = stdIn.nextDouble();
        Circle circle = new Circle(radius);

        System.out.println("円周の長さは" + circle.circumference(radius) + "です。");
        System.out.println("円の面積は" + circle.area(radius) + "です。");
   }
}
