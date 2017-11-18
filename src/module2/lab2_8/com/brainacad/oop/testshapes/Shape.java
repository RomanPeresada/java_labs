package module2.lab2_8.com.brainacad.oop.testshapes;

public abstract class Shape implements Drawable{
    private String color;

    public Shape(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape color is: "+ color + "\nShape area is: " + calculateArea();
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();
}
