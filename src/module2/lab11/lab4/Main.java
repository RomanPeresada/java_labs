package module2.lab11.lab4;

import module2.lab2_8.com.brainacad.oop.testshapes.Circle;
import module2.lab2_8.com.brainacad.oop.testshapes.Rectangle;


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = (Rectangle) Shape.parseShape("Rectangle:RED:10,20");
        System.out.println(rectangle.toString());
        Circle circle = (Circle) Shape.parseShape("dqwdwqfw4rf");
        System.out.println(circle.toString());

    }
}
