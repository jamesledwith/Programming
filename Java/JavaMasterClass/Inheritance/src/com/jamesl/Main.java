package com.jamesl;

public class Main {

    public static void main(String[] args) {
    Animal animal = new Animal(1,1,40,160, "Kangaroo");

    Dog dog = new Dog(120,140,"Harry",1,4,1,36,"Long");

    dog.eat();
    dog.walk();
    dog.run();
    }
}
