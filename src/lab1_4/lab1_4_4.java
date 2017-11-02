package lab1_4;

public class lab1_4_4 {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 10, d = 10;
        System.out.println("a= " + a++);
        System.out.println("a= " + a);
        System.out.println("b= " + ++b);
        System.out.println("c= " + c--);
        System.out.println("c= " + c);
        System.out.println("d= " + --d);
        System.out.println("a+(b++)+(--d)+(++a)= " + (a + b++ + --d + ++a));


    }
}
