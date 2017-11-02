package lab1_4;

public class labs1_4_3 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b =false;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(!a | b);
        System.out.println(!a & !b);
        System.out.println((a^b^a^a)& a );
    }
}
