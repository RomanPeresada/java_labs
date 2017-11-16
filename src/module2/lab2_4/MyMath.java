package module2.lab2_4;

public class MyMath {

    public static final double PI = 3.14;

    public static int findMin(int[] array) {
        int min = array[0];
        for (int x : array) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static double areaOfCircle(double radius){
        return (PI * radius * radius);
    }
}
