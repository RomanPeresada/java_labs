package module2.lab2_8.com.brainacad.oop.testshapes;

public class Rectangle extends Shape implements Comparable {
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
        return "This is Rectangle, color: " + getColor() + ", width = " + width + ", height = " + height + ", shape area is: " + calculateArea();
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public int compareTo(Object o) {
        Rectangle c = (Rectangle) o;
        if (this.width > c.width) return -1;
        if (this.width < c.width) return 1;
        return 0;
    }
}
