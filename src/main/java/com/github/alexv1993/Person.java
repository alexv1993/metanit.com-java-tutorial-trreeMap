package com.github.alexv1993;

/**
 * Created by Alex on 08.10.2017.
 */
class Person {

    private String name;

    public Person(String value) {
        name = value;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
