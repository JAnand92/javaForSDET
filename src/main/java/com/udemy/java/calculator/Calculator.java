package com.udemy.java.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final static Map<String, MathOperation> map = new HashMap<>();

    static {
        map.put("+", (a,b) -> a + b);
        map.put("-", (a,b) -> a - b);
        map.put("*", (a,b) -> a * b);
        map.put("/", (a,b) -> a / b);
    }

    public static void addOperation(String key, MathOperation mathOperation) {
        map.put(key, mathOperation);
    }

    public static int calculate(String expression) {
        String[] expr = expression.split(" ");
        int onScreenNumber = Integer.parseInt(expr[0]);

        for (int i = 1; i < expr.length ; i = i + 2) {
            MathOperation op = map.get(expr[i]);
            int enteredNumber = Integer.parseInt(expr[i+1]);
            onScreenNumber = calculate(onScreenNumber, op, enteredNumber);
        }
        return onScreenNumber;
    }

    private static int calculate(int onScreenNumber, MathOperation mathOperation, int enteredNumber) {
        return mathOperation.operate(onScreenNumber, enteredNumber);
    }
}
