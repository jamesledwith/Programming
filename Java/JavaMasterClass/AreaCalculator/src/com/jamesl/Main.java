package com.jamesl;

public class Main {

    private static final int INVALID_INPUT_VALUE = -1;
    private static final double PI = 3.14159;

    public static void main(String[] args) {
        System.out.println(area((5.0)));
        System.out.println(area(4.0,5.0));
        System.out.println(area((-9)));
        System.out.println(area(-4,-2));
    }

    public static double area(double radius){
        if (radius <0 ) {
            return INVALID_INPUT_VALUE;
        }

        double areaOfCircle = radius * radius * PI;

        return areaOfCircle;
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0) {
            return INVALID_INPUT_VALUE;
        }

        double areaOfRectangle = x * y;

        return areaOfRectangle;

    }
}
