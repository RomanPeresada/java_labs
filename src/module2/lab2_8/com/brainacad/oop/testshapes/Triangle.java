package module2.lab2_8.com.brainacad.oop.testshapes;


import java.util.Comparator;

import static java.lang.Math.sqrt;

public class Triangle extends Shape implements Comparable {
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
        return "This is Triangle, color: " + getColor() + ", a = " + a + " b = " + b + " c = " + c + ", shape area is: " + calculateArea();
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public int compareTo(Object o) {
        Triangle c = (Triangle) o;
        if (this.calculateArea() > c.calculateArea()) return 1;
        if (this.calculateArea() < c.calculateArea()) return -1;
        return 0;
    }

}
