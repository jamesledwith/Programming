package com.jamesl;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(125,40));
        System.out.println(getDurationString(4000));
    }

    private static String getDurationString(long minutes, long seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long mins = minutes % 60;
        long secs = seconds;

        String hoursString = hours + "h";
        String minutesString = mins + "m";
        String secondsString = seconds + "s";

        if (hours <10 || mins < 10 || seconds <10) {
            hoursString = "0" + hoursString;
            minutesString = "0" + minutesString;
            secondsString = "0" + secondsString;
        }
        //String output = hours + "h " + mins + "m " + secs + "s";
        //System.out.println(output);
        return hoursString + " " + minutesString + " " + secondsString + " ";
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutesFromSeconds = seconds / 60;
        long secondsLeftOver = seconds % 60;


        //String Total = getDurationString(minutesFromSeconds,secondsLeftOver);
        //System.out.println("Mins " + minutesFromSeconds + " Secs "+ "Total" + Total);

        return getDurationString(minutesFromSeconds,secondsLeftOver);
    }
}
