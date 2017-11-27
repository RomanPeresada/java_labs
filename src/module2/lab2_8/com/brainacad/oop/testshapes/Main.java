package module2.lab2_8.com.brainacad.oop.testshapes;


import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static module2.lab2_8.com.brainacad.oop.testshapes.Shape.parseShape;

public class Main {
    public static void main(String[] args) {

        //task 2.9.3 and 4
        String[] arrayOfStrings2 = {"Rectangle:RED:10,20",
                "Triangle:GREEN:9,7,12",
                "Circle:BLACK:10"};
        try {
            Shape[] shapes2 = new Shape[3];
            shapes2[0] = parseShape(arrayOfStrings2[0]);
            shapes2[1] = parseShape(arrayOfStrings2[1]);
            shapes2[2] = parseShape(arrayOfStrings2[2]);
            for (Shape s : shapes2) {
                System.out.println(s);
            }
            System.out.println("***************");

        }catch (InvalidShapesStringException e){
            System.out.println(e.getMessage());
        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter of quantity strings ");
        int quantity = Integer.parseInt(scanner.nextLine());
        String[] arrayOfStrings = new String[quantity];
        for (int i = 0; i < quantity; i++) {
            arrayOfStrings[i] = scanner.nextLine();
        }

        try {
            Shape[] shapes = new Shape[quantity];
            for (int i = 0; i < quantity; i++) {
                shapes[i] = Shape.parseShape(arrayOfStrings[i]);
            }
            for (Shape s : shapes) {
                System.out.println(s);
            }
        }catch (InvalidShapesStringException e){
            System.out.println(e.getMessage());
        }


//        Shape[] shapes = new Shape[9];
//        double sumArea = 0, sumRectArea = 0, sumTriangleArea = 0, sumCircleArea = 0;
//        for (int i = 0; i < 5; i++) {
//            shapes[i] = new Rectangle("YELLOW", 2 * i, (3 * (i + 1)));
//        }
//        for (int i = 5; i < 7; i++) {
//            shapes[i] = new Circle("BLACK", (6 + i));
//        }
//        for (int i = 7; i < 9; i++) {
//            shapes[i] = new Triangle("BLUE", 2 + i, 3 + i, 4 + i);
//        }
//        for (Shape shape : shapes) {
//            sumArea += shape.calculateArea();
//            if (shape instanceof Circle) {
//                sumCircleArea += shape.calculateArea();
//            } else if (shape instanceof Triangle) {
//                sumTriangleArea += shape.calculateArea();
//            } else {
//                sumRectArea += shape.calculateArea();
//            }
//            shape.draw();
//        }
//        System.out.println("********************");
//
//        Rectangle rectangle1 = new Rectangle("Green",21,17);
//        Rectangle rectangle2 = new Rectangle("Yellow",23,15);
//
//        System.out.println(rectangle1.compareTo(rectangle2));
//        System.out.println();
//
//        Rectangle[] arr2 = new Rectangle[6];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = new Rectangle("YELLOW", 2 * i, (3 * (i + 1)));
//        }
//
//        for (Rectangle rectangle : arr2) {
//            rectangle.draw();
//        }
//
//        Arrays.sort(arr2);
//
//        System.out.println();
//        for (Rectangle rectangle : arr2) {
//            rectangle.draw();
//        }
//        System.out.println();
//
//        Arrays.sort(shapes, new Comparator<Shape>() {
//            @Override
//            public int compare(Shape o1, Shape o2) {
//                return o1.getColor().compareTo(o2.getColor());
//            }
//        });
//
//        for (Shape shape : shapes) {
//            shape.draw();
//        }
//
//


//        Shape shape = new Shape("Yellow");
//        System.out.println(shape);
//        System.out.println();
//
//        Circle circle = new Circle("Black",17);
//        System.out.println(circle);
//        System.out.println();
//
//        Rectangle rectangle = new Rectangle("Green",21,23);
//        System.out.println(rectangle);
//        System.out.println();
//
//        Triangle triangle = new Triangle("White",5,5,5);
//        System.out.println(triangle);
    }
}
