package com.jamesl;

public class Main {

    public static void main(String[] args)
    {
        calcFeetAndInchesToCentimeters(7,5);
        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if (feet > 0 || (inches > 0 || inches < 12))
        {

            double feetToCentimeters = feet * 12 * 2.54;
            double inchToCentimeters = inches * 2.54;
            double totalCentimeters = feetToCentimeters + inchToCentimeters;
            System.out.println("Feet: "+ feet + " Inches: " + inches + " = " + totalCentimeters + "cm");

            return totalCentimeters;
        }
        else
        {
            System.out.println("Invalid range");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if (inches < 0)
        {
            return -1;
        }

        double feetInInches = (int) inches / 12;
        double remainingFeetInInches = (int) inches % 12;
        System.out.println(feetInInches + "  " + remainingFeetInInches);
        System.out.println(calcFeetAndInchesToCentimeters(feetInInches, remainingFeetInInches));
        return calcFeetAndInchesToCentimeters(feetInInches, remainingFeetInInches);




    }



}


