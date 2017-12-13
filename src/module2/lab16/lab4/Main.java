package module2.lab16.lab4;

public class Main {
    static void foo(Animal a){
        System.out.println("Animal");
    }
    static void foo(Dog d){
        System.out.println("Dog");
    }
    static void foo(Puppy p){
        System.out.println("Puppy");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Dog dog = new Dog();
        Puppy puppy = new Puppy();
        Animal animal = new Puppy();
        foo(a);
        foo(dog);
        foo(puppy);
        foo(animal);
        foo(null);
    }
}
