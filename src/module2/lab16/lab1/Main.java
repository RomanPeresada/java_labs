package module2.lab16.lab1;

public class Main {
    public static void foo(Animal a){
        System.out.println("Animal");
    }

    public static void foo(Dog d){
        System.out.println("Dog");
    }

    public static void main(String[] args) {
         Animal a = new Dog();
        foo(a);
    }
}
