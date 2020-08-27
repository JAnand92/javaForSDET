package com.udemy.java.polimorphism;

public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Cat can bark.");
    }

    @Override
    public void walk() {
        System.out.println("Cat can walk.");
    }

}
