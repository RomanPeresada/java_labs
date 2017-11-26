package module2.lab10.lab4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Circle extends Shape implements Comparable {
    private double radius;


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public static Circle parseCircle(String string) {
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

        if (shape.equals("Circle")) {
            double radius = 0;
            while (matcherForArguments.find()) {
                radius = Double.parseDouble(matcherForArguments.group());
            }
            Circle circle = new Circle(color, radius);
            return circle;
        } else {
            return null;
        }

    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
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
