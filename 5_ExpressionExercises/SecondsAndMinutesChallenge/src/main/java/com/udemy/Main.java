package com.udemy;

public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));

        // hourH minuteM secondsS format
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            System.out.println("Invalid 1");
        }

        return getDurationString(seconds/ 60,seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds){


        if (minutes < 0){
            System.out.println("Invalid 2");
        }
        if (seconds < 0 || seconds > 60) {
            System.out.println("Invalid 3");
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }
}