package com.udemy.java.datatype;

public class PrimitiveType {
    /*Pass by value - Example*/
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Before :: " + i);
        change(i);
        System.out.println("After :: " + i);
    }

    /*There is no mechanism to send the value back to the main method. Even though change value of a would be 6.
    * Main method print it 5. This is example of pass by value. Primitive data type do not have references. They only
    * holds value. Byte, int, double, float, and so on. */
    private static void change(int a) {
        a++; //a=a+1
    }
}
