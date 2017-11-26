package module2.lab10.lab4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rectangle extends Shape implements Comparable {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public static Rectangle parseRectangle(String string) {
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

        if (shape.equals("Rectangle")) {
            double[] arrayOfRectangle = new double[2];
            int i = 0;
            while (matcherForArguments.find()) {
                Double d = Double.parseDouble(matcherForArguments.group());
                arrayOfRectangle[i] = d;
                i++;
            }
            Rectangle rectangle = new Rectangle(color, arrayOfRectangle[0], arrayOfRectangle[1]);
            return rectangle;
        } else {
            return null;
        }

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
