package com.jamesl;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5;
        float myFloatValue = 5.4f;
        double myDoubleValue = 5d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //pounds to kg converter
        double numOfPounds = 155d;
        double poundsToKilo = numOfPounds * 0.45359237d;
        System.out.println(poundsToKilo);
    }
}
