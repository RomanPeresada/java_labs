package module2.lab2_8.com.brainacad.oop.testshapes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Shape implements Drawable {
    private String color;
    public static final Pattern PATTERN_FOR_ARGUMENTS = Pattern.compile("\\d+");
    public static final Pattern PATTERN_FOR_SHAPE = Pattern.compile("[A-Z][a-z]+");
    public static final Pattern PATTERN_FOR_COLOR = Pattern.compile("[A-Z]+");

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

    public static Shape parseShape(String string) {
        Matcher matcherForShape = PATTERN_FOR_SHAPE.matcher(string);
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
