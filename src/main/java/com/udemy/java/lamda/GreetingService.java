package com.udemy.java.lamda;

/*SAM - Single Abstract Method*/

@FunctionalInterface //this expression is not necessary but it should be there to indicate others...
                     // it will be used in lambda expression.
public interface GreetingService {
    String greet(String name);
}
