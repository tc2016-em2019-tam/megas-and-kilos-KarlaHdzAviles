package com.company;

public class Kilobyte {
    private int kilobytes = 0;

    //Kilobytes can´t be negative numbers, so my constructor and setter have an exception
    public void MegaAndKiloBytes(int kilobytes) throws Exception {
        if (kilobytes < 0) {
            throw new Exception("Kilobytes have to be positive numbers");
        }
        this.kilobytes = kilobytes;
    }

    //getter
    public int getKilobytes() {
        return kilobytes;
    }

    //setter
    public void setKilobytes(int kilobytes) throws Exception {
        if (kilobytes < 0) {
            throw new Exception("Kilobytes have to be positive numbers.");
        }
        this.kilobytes = kilobytes;
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes) throws Exception {
        int kb = kilobytes / 1024;
        int Kb= kilobytes % 1024;

        if (Kb > 0) {
            System.out.println(kilobytes + " KB = " + kb + " MB and " + Kb + " KB");
        } else {
            System.out.println(kilobytes + " KB = " + kb + " MB");
        }
    }
}
