package com.jamesl;

public class Main {

    public static void main(String[] args) {
        char value = 'b';

        switch (value)
        {
            case 'a':
                System.out.println("We have found your letter - " + value);
                break;
            case 'b': case 'c': case 'd': case 'e':
                System.out.println("We have found your letter - " + value);
                break;

            default:
                System.out.println("Character not found -_- ");
        }

    }
}
