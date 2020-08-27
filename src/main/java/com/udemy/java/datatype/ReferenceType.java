package com.udemy.java.datatype;

import java.util.Arrays;

public class ReferenceType {
    public static void main(String[] args) {
        /*Reference of arr is created in the memory: say abc123*/
        int[] arr = new int[] {1,2,3};

        System.out.println("Before ::" + Arrays.toString(arr));
        change(arr);
        System.out.println("After ::" + Arrays.toString(arr));

    }

    /*This is best example for pass by reference. Array, String these hold reference for the data and pass to the
    * main method. And, now, value of array is changed.
    * Instead of sending direct value, it sends some reference, and whatever value changes, it stores in reference.*/
                                //abc123
    private static void change(int[] a) {
        a[0]++;
        a[1]++;
        a[2]++;
    }
}
