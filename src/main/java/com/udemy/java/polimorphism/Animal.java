package com.udemy.java.polimorphism;

public abstract class Animal {

    public void makeSound() {
        System.out.println("I can make sound.");
    }

    public void walk() {
        System.out.println("I can walk.");
    }

    public void test(Animal a) {
        a.makeSound();
        a.walk();
    }
}
