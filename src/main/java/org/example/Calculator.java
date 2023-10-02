package org.example;

public class Calculator {

    public Integer multiply(Integer p1, Integer p2){
        return p1 * p2;
    }

    public Integer divideByZero(Integer p1, Integer p2){
        if(p2 != 0) {
           return p1 / p2;
        } else{
            throw new IllegalArgumentException("Can't divide by zero");
        }
    }
}
