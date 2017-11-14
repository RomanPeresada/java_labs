package lab2_4;

import lab2_4.lab2_4_6.MyPyramid;
import lab2_4.lab2_4_7.GravityCalculator;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("Lara", "Kevs", "manager", 3456);
        Employee e2 = new Employee("Alis", "Kerri", "builder", 2336);
        Employee e3 = new Employee("Mark", "Masser", "teacher", 4556);
        Employee e4 = new Employee("KOnor", "Porena", "manager", 1123456);
        System.out.println("Count of employees = " + Employee.getNumberOfEmployees());

        System.out.println("PI = " + MyCalc.calcPi(555));

        MyPyramid.printPyramid(9);

        System.out.println("The distance an object will fall in Earth's gravity = "+GravityCalculator.calculateDistance(10));
    }
}
