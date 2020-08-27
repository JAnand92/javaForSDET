package com.udemy.java.datatype;

import java.util.Arrays;

public class MutationInJava {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3};

        predict(arr);
        totalSale(arr);

    }

    /*SO, java is always pass by value. Even though it sends reference, it sends a copy of the reference.
    * Which create mutation - same result if same reference. Here, 2 functions but in real life there would be
    * 1000 classes and their objects. Hence, it will create unexpected result. To solve this we need to create new object
    * which indeed change the references and then their is no problem. String in java is one of the example.*/

    private static void totalSale(int[] a) {
        a = Arrays.copyOf(a, a.length);
        a[0]++;
        a[1]++;
        System.out.println("Prediction for next month :: " + (a[0] + a[1] + a[2]));
    }

    private static void predict(int[] a) {

        System.out.println("Total sale for next month :: " + (a[0] + a[1] + a[2]));

    }
}
