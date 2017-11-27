package module2.lab10.lab3;

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
        Pattern patternForArguments = Pattern.compile("\\d+");
        Pattern patternForShape = Pattern.compile("[A-Z][a-z]+");
        Pattern patternForColor = Pattern.compile("[A-Z]+");
        Matcher matcherForShape = patternForShape.matcher(string);
        Matcher matcherForArguments = patternForArguments.matcher(string);
        Matcher matcherForColor = patternForColor.matcher(string);
        String color = "";
        while (matcherForColor.find()) {
            color = matcherForColor.group();
        }
        String shape = "";
        while (matcherForShape.find()) {
            shape = matcherForShape.group();
        }

        switch (shape) {
            case "Rectangle":
                double[] arrayOfRectangle = new double[2];
                int i = 0;
                while (matcherForArguments.find()) {
                    Double d = Double.parseDouble(matcherForArguments.group());
                    arrayOfRectangle[i] = d;
                    i++;
                }
                return new Rectangle(color, arrayOfRectangle[0], arrayOfRectangle[1]);

            case "Triangle":
                double[] arrayOfTriangle = new double[3];
                int j = 0;
                while (matcherForArguments.find()) {
                    Double d = Double.parseDouble(matcherForArguments.group());
                    arrayOfTriangle[j] = d;
                    j++;
                }
                return new Triangle(color, arrayOfTriangle[0], arrayOfTriangle[1], arrayOfTriangle[2]);

            case "Circle":
                double radius = 0;
                while (matcherForArguments.find()) {
                    radius = Double.parseDouble(matcherForArguments.group());
                }
                int k = 0;
                return new Circle(color, radius);

            default:
                return null;


        }

    }
}

