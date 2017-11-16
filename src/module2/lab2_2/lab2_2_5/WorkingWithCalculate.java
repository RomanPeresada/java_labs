package module2.lab2_2.lab2_2_5;

class A {
    private double area;

    public void calculateSquare(double a, double b) {
        area = a * b;
        System.out.println("Area of rectangle is - "+area);
    }

    public void calculateSquare(int a) {
        area =a*a;
        System.out.println("Area of foursquare is - "+area);
    }
    public void calculateSquare(double radius){
        area = 2*(radius*radius)*Math.PI;
        System.out.println("Area of circle is - "+area);

    }

}

class B{
    private int area;

    public void setArea(final int area) {
        this.area = area;
        System.out.println("Area is "+area);
    }
}


public class WorkingWithCalculate {
    public static void main(String[] args) {

        A a =new A();
        a.calculateSquare(21.0);
        a.calculateSquare(12);
        a.calculateSquare(21,2);

        B b =new B();
        b.setArea(32);
        b.setArea(22);

    }
}
