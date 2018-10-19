package com.jamesl;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
            {
            int calcMegabytes = kiloBytes / 1024;
            int calcKilobytes = kiloBytes % 1024;
                    System.out.print(kiloBytes + " KB = " +
                    calcMegabytes + " MB and " + calcKilobytes + " KB");
        }
        }
}
