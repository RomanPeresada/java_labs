package module2.lab11.lab4;

import module2.lab2_8.com.brainacad.oop.testshapes.Circle;
import module2.lab2_8.com.brainacad.oop.testshapes.Drawable;
import module2.lab2_8.com.brainacad.oop.testshapes.Rectangle;
import module2.lab2_8.com.brainacad.oop.testshapes.Triangle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public abstract class Shape implements Drawable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape color is: " + color + "\nShape area is: " + calculateArea();
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();

    public static Object parseShape(String string) {
        try {
            InvalidShapeStringException.test(string);
        } catch (InvalidShapeStringException e) {
            System.out.println(e.getMessage());
        }
        Pattern patternForShape = Pattern.compile("[A-Z][a-z]+");
        Matcher matcherForShape = patternForShape.matcher(string);
        String shape = "";
        while (matcherForShape.find()) {
            shape = matcherForShape.group();
        }

        switch (shape) {
            case "Rectangle":
                return Rectangle.parseRectangle(string);
            case "Triangle":
                return Triangle.parseTriangle(string);
            case "Circle":
                return Circle.parseCircle(string);
            default:
                return null;

        }
    }

}




