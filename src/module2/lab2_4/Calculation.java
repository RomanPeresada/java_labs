package module2.lab2_4;

public class Calculation {
    public static void main(String[] args) {
        System.out.println("Max = " + MyMath.findMax(new int[]{21, 432, 123, 43, -75}));
        System.out.println("Min = " + MyMath.findMin(new int[]{234, 654, -76, -64, -99, 435, 1}));
        System.out.println("Area of circle  = "+ MyMath.areaOfCircle(3));
    }
}
