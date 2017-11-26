package module2.lab10.lab2;

public class Main {
    public static void main(String[] args) {
        System.out.println(compute(896, 479.3f));
        System.out.println(compute((byte)3,(short)45));

    }

    public static Double compute(Integer int1, Float float1) {
        return int1.doubleValue() + float1.doubleValue();
    }

    public static Long compute(Byte byte1, Short short1) {
        return byte1.longValue() + short1.longValue();
    }
}
