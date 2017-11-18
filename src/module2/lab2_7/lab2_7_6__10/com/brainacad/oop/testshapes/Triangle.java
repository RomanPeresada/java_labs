package module2.lab2_7.lab2_7_6__10.com.brainacad.oop.testshapes;


import static java.lang.Math.sqrt;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2;
        return sqrt((s * (s - a) * (s - b) * (s - c)));
    }

    @Override
    public String toString() {
        return "This is Triangle, color: " + getColor() + ", a = " + a + " b = " + b + " c = " + c + "\nShape area is: " + calculateArea();
    }
}
