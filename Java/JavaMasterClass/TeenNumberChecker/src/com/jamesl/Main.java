package com.jamesl;

public class Main {

    public static void main(String[] args)
    {

    }

    public static boolean hasTeen(int x, int y, int z)
    {
        if ((x >=13 && x <=19) || (y >=13 && y <=19) || (z >=13 && z <=19))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
