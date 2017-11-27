package module2.lab2_8.com.brainacad.oop.testshapes;

import java.util.regex.Matcher;


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

    public static Triangle parseTriangle(String string) {

        Matcher matcherForArguments = PATTERN_FOR_ARGUMENTS.matcher(string);
        Matcher matcher = PATTERN.matcher(string);
        String color = "";
        while (matcher.find()) {
            color = matcher.group();
        }
        double[] arrayOfTriangle = new double[3];
        int j = 0;
        while (matcherForArguments.find()) {
            Double d = Double.parseDouble(matcherForArguments.group());
            arrayOfTriangle[j] = d;
            j++;
        }
        return new Triangle(color, arrayOfTriangle[0], arrayOfTriangle[1], arrayOfTriangle[2]);

    }

}
