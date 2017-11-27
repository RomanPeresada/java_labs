package module2.lab2_8.com.brainacad.oop.testshapes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Shape implements Drawable {
    private String color;
    public static final Pattern PATTERN_FOR_ARGUMENTS = Pattern.compile("\\d+");
    public static final Pattern PATTERN = Pattern.compile("([A-Z][a-z]+):([A-Z]+):\\d+(,\\d+)*");

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

    public static Shape parseShape(String string) throws InvalidShapesStringException {

        InvalidShapesStringException.isValid(string);

        Matcher matcher = PATTERN.matcher(string);
        String shape = "";

        while (matcher.find()) {
            shape = matcher.group(1);
        }

        switch (shape) {
            case "Rectangle":
                return Rectangle.parseRectangle(string);
            case "Triangle":
                return Triangle.parseTriangle(string);
            case "Circle":
                return Circle.parseCircle(string);
            default:
                throw new InvalidShapesStringException("Shape isn`t!");


        }
    }
}
