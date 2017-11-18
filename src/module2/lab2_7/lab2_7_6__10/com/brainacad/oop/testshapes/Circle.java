package module2.lab2_7.lab2_7_6__10.com.brainacad.oop.testshapes;

import static module2.lab2_4.MyMath.PI;

public class Circle extends Shape {
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
        return "This is circle, color: " + super.getColor() + ", radius = " + radius + "\nShape area is: " + calculateArea();

    }
}
