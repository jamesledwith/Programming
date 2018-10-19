package com.jamesl;

public class Main {

    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
    }

    public static boolean isLeapYear(int year)
    {
        if (year >=1 && year <=9999)
        {
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            {
                System.out.println("Valid range and leap");
                return true;
            }
            else
            {
                System.out.println("Valid range not leap");
                return false;
            }
        }
        else
            System.out.println("false");
            return false;
    }
}
