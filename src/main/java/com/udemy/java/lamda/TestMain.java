package com.udemy.java.lamda;

import java.util.function.Supplier;

public class TestMain {
    public static void main(String[] args) {

       /* //GreetingService g = (n) -> n.toUpperCase();
        test((n) -> n.toUpperCase() + n.toLowerCase());
        test(n -> n.length() + "");

        String ss = getLambda().greet("data");
        System.out.println(ss);*/

       /*StringOperations operations  = (s) -> System.out.println(s);*/
        /*Method Reference*/
        /*StringOperations operations = System.out::println;
       operations.accept("ud");*/

        /*StringOperations op1 = String::toUpperCase;
        System.out.println(op1.accept("Jay"));*/

       /* StringOperations op1 = (s1, s2) -> s1.concat(s2);*/
        StringOperations op1 = String::concat;
        System.out.println(op1.accept("ab", "cd"));

        Supplier<Double> random = () -> Math.random();

        Supplier<Double> random1 = Math::random;

        System.out.println(random.get());



    }

    private static void test(GreetingService g) {
        String s = g.greet("Jay!");
        System.out.println(s);



    }

    private static GreetingService getLambda() {
       /* GreetingService g = s -> s.toUpperCase();*/
        return g -> g.toUpperCase();
    }
}
