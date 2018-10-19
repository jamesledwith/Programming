package com.jamesl;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
    }

    public static boolean isCatPlaying(boolean summer, int temp){
        if (temp >= 25 && temp <= 35){
            return true;
        }
        else if (summer && temp >= 25 && temp <= 45){
            return true;
        }
        else{
            return false;
        }
    }
}
