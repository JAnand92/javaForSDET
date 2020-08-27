package com.udemy.java.polimorphism;

public class Horse extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Horse can bark.");
    }

    @Override
    public void walk() {
        System.out.println("Horse can walk.");
    }

}
