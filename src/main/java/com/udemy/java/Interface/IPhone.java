package com.udemy.java.Interface;

public class IPhone implements Alarm{

    public void dial() {
        System.out.println("I can dial.");
    }

    public void answerPhone() {
        System.out.println("I can answer phone.");
    }

    public void setAlarm() {
        System.out.println("I can set alarm.");
    }

}
