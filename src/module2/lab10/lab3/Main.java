package module2.lab10.lab3;

import module2.lab2_8.com.brainacad.oop.testshapes.Circle;
import module2.lab2_8.com.brainacad.oop.testshapes.Rectangle;
import module2.lab2_8.com.brainacad.oop.testshapes.Triangle;

import static module2.lab10.lab3.Shape.*;

public class Main {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"Rectangle:RED:10,20",
                                    "Triangle:GREEN:9,7,12",
                                    "Circle:BLACK:10"};

        Rectangle rectangle = (Rectangle) parseShape(arrayOfStrings[0]);
        System.out.println(rectangle);

        Triangle triangle = (Triangle) parseShape(arrayOfStrings[1]);
        System.out.println(triangle);

        Circle circle = (Circle) parseShape(arrayOfStrings[2]);
        System.out.println(circle);

//        Shape[] shapes = new Shape[3];
//        shapes[0] = parseShape(arrayOfStrings[0]);
//        shapes[1] = (Shape) parseShape(arrayOfStrings[1]);
//        shapes[2] = (Shape) parseShape(arrayOfStrings[2]);
//
//        for(Shape s: shapes){
//            System.out.println(s);
//        }
    }
}
