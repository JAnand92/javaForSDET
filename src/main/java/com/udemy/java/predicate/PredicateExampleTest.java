package com.udemy.java.predicate;

import java.util.function.Predicate;

public class PredicateExampleTest {
    public static void main(String[] args) {

        Predicate<Integer> p1 = (i) -> i > 2;

        System.out.println(
                p1.test(4)
        );

        System.out.println(
                p1.negate().test(4)
        );
    }
}
