package module2.lab2_7.lab2_7_6__10.com.brainacad.oop.testshapes;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color: " + getColor() + ", width = " + width + ", height = " + height + "\nShape area is: " + calculateArea();
    }

}
