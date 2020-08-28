package com.udemy.java.lamda;

public class Calculator {

    public static void main(String[] args) {

       /* MathOperation add = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a+b;
            }
        };*/

        MathOperation add = (i,j) -> (i+j);
        MathOperation sub = (i,j) -> (i-j);
        MathOperation mul = (i,j) -> (i*j);
        MathOperation div = (i,j) -> (i/j);

        System.out.println(calculate(add));
        System.out.println(calculate(sub));
        System.out.println(calculate(mul));
        System.out.println(calculate(div));

        int onScreenNumber = 0;

        onScreenNumber = calculate(5, add, 2);
        onScreenNumber = calculate(onScreenNumber, sub, 3);
        onScreenNumber = calculate(onScreenNumber, mul, 4);
        onScreenNumber = calculate(onScreenNumber, div, 8);

        System.out.println(onScreenNumber);
    }

    private static int calculate(MathOperation m) {
        int a = 100;
        int b = 20;
        return m.operate(a,b);

    }

    private static int calculate(int onScreenNumber, MathOperation m, int enteredNumber) {
        return m.operate(onScreenNumber, enteredNumber);
    }
}
