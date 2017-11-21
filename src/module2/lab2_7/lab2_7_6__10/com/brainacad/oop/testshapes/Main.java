package module2.lab2_7.lab2_7_6__10.com.brainacad.oop.testshapes;


public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[9]; //желательно константой размер вынести
        double sumArea = 0, sumRectArea = 0, sumTriangleArea = 0, sumCircleArea = 0; //значения и так 0 по умолчанию
        for (int i = 0; i < 5; i++) {
            shapes[i] = new Rectangle("YELLOW", 2 * i, (3 * (i + 1)));
        }
        for (int i = 5; i < 7; i++) {
            shapes[i] = new Circle("BLACK", (6 + i));
        }
        for (int i = 7; i < 9; i++) {
            shapes[i] = new Triangle("BLUE", 2 + i, 3 + i, 4 + i);
        }
        for (Shape shape : shapes) {
            sumArea += shape.calculateArea();
            if (shape instanceof Circle) {
                sumCircleArea += shape.calculateArea();
            } else if (shape instanceof Triangle) {
                sumTriangleArea += shape.calculateArea();
            } else {
                sumRectArea += shape.calculateArea();
            }
            System.out.println(shape);
        }
        System.out.println();

        System.out.println("Total area is: " + sumArea);
        System.out.println("Total area of rectangle is: " + sumRectArea);
        System.out.println("Total area of circle is: " + sumCircleArea);
        System.out.println("Total area of triangle is: " + sumTriangleArea);


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
