package module2.lab10.lab1;

public class Main {
    public static void main(String[] args) {
        Integer mX = 285;
        Integer mX1 = new Integer(285);
        Integer mX2 = Integer.valueOf(285);
        Integer mX3 = Integer.parseInt("285");
        Integer mX4 = mX2;
        System.out.println(mX2 == mX4);
        mX4 = 344;
        System.out.println(mX == mX1);
        System.out.println(mX == mX2);
        System.out.println(mX == mX3);
        System.out.println(mX2 == mX3);
        System.out.println(mX2 == mX4);
        System.out.printf("mX4 = %d mX2 = %d%n", mX4, mX2);
    }
}

