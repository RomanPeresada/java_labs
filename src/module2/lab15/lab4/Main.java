package module2.lab15.lab4;

public class Main {
    public static void main(String[] args) {
        MyNumGenerator myNumGenerator = new MyNumGenerator(9,11);
        System.out.println(myNumGenerator.generate());
        System.out.println(myNumGenerator.generateDistinct());

    }
}
