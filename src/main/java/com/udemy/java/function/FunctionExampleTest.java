package com.udemy.java.function;

import java.util.function.Function;

public class FunctionExampleTest {

    public static void main(String[] args) {

        Function<String, Integer> strLen = (s) -> s.length();
        Function<Integer, Integer> square = (s) -> s*s;
        strLen.andThen(square).apply("Hi, how are you?");

        Function<Integer, Integer> plus2 = (i) -> i + 2;

        System.out.println(
                plus2.compose(square).apply(8)
        );
    }

}
