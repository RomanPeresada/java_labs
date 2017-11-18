package module2.lab2_7.lab2_7_6__10.com.brainacad.oop.testshapes;

public class Shape {
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

    public double calculateArea(){
        return 0.0;
    }
}
