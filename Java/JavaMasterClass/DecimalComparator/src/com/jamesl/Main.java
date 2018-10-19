package com.jamesl;

public class Main {

    public static void main(String[] args)
    {
       areEqualByThreeDecimalPlaces(3.1223d,3.12311221212d);
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second)
    {
        int firstTestNum = (int)(first * 1000);
        int secondTestNum = (int)(second * 1000);

        if (firstTestNum == secondTestNum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
