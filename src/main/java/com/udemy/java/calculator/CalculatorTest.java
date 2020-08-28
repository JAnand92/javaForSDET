package com.udemy.java.calculator;

public class CalculatorTest {

    public static void main(String[] args) {
        String expr = "5 + 2 - 3 + 6 * 8 / 9 ^ 2 % 3";

        Calculator.addOperation("^", (a, b) -> (int) Math.pow(a, b));
        Calculator.addOperation("%", (a, b) -> a % b);

        System.out.println(
                Calculator.calculate(expr)
        );
    }
}
