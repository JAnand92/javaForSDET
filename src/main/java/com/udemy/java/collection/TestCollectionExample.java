package com.udemy.java.collection;

public class TestCollectionExample {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 7, 8};

        findMax(1, 3, 5);
        findMax(arr);
        findMinMax(arr);

    }

    private static void findMax(int a, int b, int c) {

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    private static void findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }

    private static void findMinMax(int[] a) {
        findMin(a);
        findMax(a);
    }

    private static void findMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length ; i++) {
            if(a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}

