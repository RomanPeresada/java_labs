package com.ua.classwork;

public class Person {
    private String name;
    private Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person:\n" +
                "name - '" + name + '\'' +
                ", gender - " + gender;
    }
}
