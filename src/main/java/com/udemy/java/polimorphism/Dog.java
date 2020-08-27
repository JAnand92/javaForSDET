package com.udemy.java.polimorphism;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Dog can bark.");
    }

    @Override
    public void walk() {
        System.out.println("Dog can walk.");
    }

}
