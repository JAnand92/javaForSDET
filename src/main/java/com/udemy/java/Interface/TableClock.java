package com.udemy.java.Interface;

public class TableClock implements Alarm{

    public void showTime() {
        System.out.println("I can show time.");
    }

    public void setAlarm() {
        System.out.println("I can set alarm.");
    }
}
