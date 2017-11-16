package module2.lab2_6.lab2_6_1.example.testpack;

import module2.lab2_6.lab2_6_1.com.braincad.carpack.Car;
import module2.lab2_6.lab2_6_1.example.applepack.Apple;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Apple apple = new Apple();
        car.setWeight(3345);
        apple.setWeight(0.2);
        System.out.println("Weight of car is " + car.getWeight());
        System.out.println("Weight of apple is " + apple.getWeight());
    }
}
