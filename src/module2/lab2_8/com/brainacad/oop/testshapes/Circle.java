package module2.lab2_8.com.brainacad.oop.testshapes;

import java.util.Comparator;

import static module2.lab2_4.MyMath.PI;

public class Circle extends Shape implements Comparable {
    private double radius;


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "This is circle, color: " + super.getColor() + ", radius = " + radius + ", shape area is: " + calculateArea();

    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public int compareTo(Object o) {
        Circle c = (Circle) o;
        if (this.calculateArea() > c.calculateArea()) return 1;
        if (this.calculateArea() < c.calculateArea()) return -1;
        return 0;
    }

}
