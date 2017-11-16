package module2.lab2_4.lab2_4_7;

import static java.lang.Math.abs;

public class GravityCalculator {
    public static final double ACCELERATION = -9.81;

    public static double calculateDistance(double time) {
        double v = 2 * time - 1;
        double x = time * time - time + 5;
        double distance = abs(0.5 * ACCELERATION * time * time + v + time + x);
        return distance;
    }
}
