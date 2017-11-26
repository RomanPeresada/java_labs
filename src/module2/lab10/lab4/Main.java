package module2.lab10.lab4;

public class Main {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"Rectangle:RED:10,20",
                "Triangle:GREEN:9,7,12",
                "Circle:BLACK:10"};

        Shape[] shapes = new Shape[3];
        shapes[0] = (Shape) Shape.parseShape(arrayOfStrings[0]);
        shapes[1] = (Shape)Shape.parseShape(arrayOfStrings[1]);
        shapes[2] = (Shape) Shape.parseShape(arrayOfStrings[2]);

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }

}
