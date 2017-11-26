package module2.lab10.lab4;

import module2.lab2_8.com.brainacad.oop.testshapes.Shape;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.sqrt;


public class Triangle extends Shape implements Comparable {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangle parseTriangle(String string) {
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


        if (shape.equals("Triangle")) {
            double[] arrayOfTriangle = new double[3];
            int j = 0;
            while (matcherForArguments.find()) {
                Double d = Double.parseDouble(matcherForArguments.group());
                arrayOfTriangle[j] = d;
                j++;
            }
            Triangle triangle = new Triangle(color, arrayOfTriangle[0], arrayOfTriangle[1], arrayOfTriangle[2]);
            return triangle;
        }
        else{
            return null;
        }
    }

    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2;
        return sqrt((s * (s - a) * (s - b) * (s - c)));
    }

    @Override
    public String toString() {
        return "This is Triangle, color: " + getColor() + ", a = " + a + " b = " + b + " c = " + c + ", shape area is: " + calculateArea();
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public int compareTo(Object o) {
        Triangle c = (Triangle) o;
        if (this.calculateArea() > c.calculateArea()) return 1;
        if (this.calculateArea() < c.calculateArea()) return -1;
        return 0;
    }

}
