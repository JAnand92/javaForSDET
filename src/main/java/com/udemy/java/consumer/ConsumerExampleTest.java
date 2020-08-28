package com.udemy.java.consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExampleTest {

    public static void main(String[] args) {
        /*Example 1*/

        Consumer<String> c1 = (s) -> System.out.println(s);
        c1.accept("AB!");

        /*Example 2*/
        List<String> l = new ArrayList<>();

        l.add("Jay");
        l.add("Ana");

        /*One way of doing it.*/
        Consumer<String> c2 = (s) -> System.out.println(s);
        l.forEach(c2);

        /*Another way of doing it.*/
        l.forEach((s) -> System.out.println(s.toUpperCase()));

        /*Example 3 for Consumer Chaining*/

        Consumer<String> dbConsumer = (s) -> {
            System.out.println("Writing to DB::" + s);
        };

        Consumer<String> loggingConsumer = (s) -> {
            System.out.println("Logging to DB::" + s);
        };

        Consumer<String> dbLoggingConsumer = dbConsumer.andThen(loggingConsumer);

        l.forEach(dbLoggingConsumer);


        /*Example 4*/
        Map<String, Consumer<String>> map = new HashMap<>();

        map.put("db", dbConsumer);
        map.put("log", loggingConsumer);
        map.put("dbLog", dbLoggingConsumer);

        l.forEach(map.get(System.getProperty("consumer-type")));

        /*Bi Consumer*/
        BiConsumer<String, Integer> biConsumer = (s, i) -> {
            System.out.println("My name::" + s);
            System.out.println("My age::" + i);
        };

        biConsumer.accept("ude", 10);


    }
}
