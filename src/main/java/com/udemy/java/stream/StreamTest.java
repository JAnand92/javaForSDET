package com.udemy.java.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        /*Check the even number
         * Interested in only 3 numbers
         * Find the square and
         * Print on console one by one*/
        findSquare(list);

        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(3)
                .map(i -> i * i)
                .forEach(i -> System.out.println(i));

        /*Find max number in the list*/
        int max = list.stream()
                .max(Comparator.comparing(Integer::intValue))
                .get();

        System.out.println(max);

        /*Find Min number*/
        int min = list.stream()
                .sorted()
                .findFirst()
                .get();

        System.out.println(min);

        /*Find second highest number*/

        int secHighest = list.stream()
                .sorted(Collections.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secHighest);
    }

    private static void findSquare(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if(n % 2 == 0) {
                int square = (n * n);
                System.out.println(square);
            }
        }
    }
}
