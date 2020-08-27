package com.udemy.java.polimorphism;

public class TestMain {
    public static void main(String[] args) {

        System.out.println( "*** Testing for Compile-time polymorphism ***");
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("Area of square is :: " +
                areaCalculator.getArea(5)
        );

        System.out.println("Area of square is :: " +
                areaCalculator.getArea(5.25)
        );

        System.out.println("Area of rectangle is :: " +
                areaCalculator.getArea(5, 10)
        );

        System.out.println( "\n*** Testing for run-time polymorphism ***");
        Animal a = new Dog();
        a.test(a);

        a = new Cat();
        a.test(a);

        a = new Horse();
        a.test(a);
    }
}
