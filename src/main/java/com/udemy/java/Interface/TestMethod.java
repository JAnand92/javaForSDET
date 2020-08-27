package com.udemy.java.Interface;

public class TestMethod {

    public static void main(String[] args) {

        GoogleMini g = new GoogleMini();
        IPhone i = new IPhone();
        TableClock t = new TableClock();

        alarmTest(g);
        alarmTest(i);
        alarmTest(t);
    }

    private static void alarmTest(Alarm i) {
        i.setAlarm();
    }
}
