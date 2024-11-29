package com.udemy;

public class Main {
    public static void main(String[] args) {

        // EXERCISE 2
        Exercise2_SpeedConverter.printConversion(20);

        // EXERCISE 3
        Exercise3_MegaBytesConverter.printMegaBytesAndKiloBytes(3000);

        // EXERCISE 4
        boolean wakeUp = Exercise4_BarkingDog.shouldWakeUp(true, 6);
        if (wakeUp){
            System.out.println("Wake UP!!");
        }
        else {
            System.out.println("No need to wake up");
        }

        // EXERCISE 5
        boolean ly = Exercise5_LeapYearCalculator.isLeapYear(2054);
        System.out.println(ly);

        // EXERCISE 6
        boolean compareDecimals = Exercise6_DecimalComparator.areEqualByThreeDecimalPlaces(835.0992, 835.099);
        System.out.println(compareDecimals);

        // EXERCISE 7
        boolean equalSum = Exercise7_EqualSumChecker.hasEqualSum(3, 3, 6);
        System.out.println(equalSum);

        // EXERCISE 8

        // EXERCISE 9
        // EXERCISE 10
        // EXERCISE 11
        // EXERCISE 12
    }
}