package com.udemy;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // METHOD CHALLENGE - HIGH SCORE POSITION
        System.out.print("Whats the Player's name: ");
        String playerName = scanner.nextLine();

        System.out.print("Enter player Score: ");
        int playerScore = scanner.nextInt();
        scanner.nextLine();

        int playerPosition = HighScorePosition.calculateHighScorePosition(playerScore);

        HighScorePosition.displayHighScorePosition(playerName, playerPosition);


        // OVERLOADED METHOD CHALLENGE - CONVERT TO CENTIMETERS
        System.out.println("Would you like to convert \n (1) only inches \n (2) Feet and inches?");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("1")) {
            System.out.print("What is the inch you want to convert to centimeter: ");
            int inchAnswer = scanner.nextInt();
            scanner.nextLine();
            double centimeterConvert = ConvertCentimetersOverload.convertToCentimeters(inchAnswer);
            System.out.println("Converted centimeter is: " + centimeterConvert);
        }
        else if (answer.equalsIgnoreCase("2")){
            System.out.print("What is the feet: ");
            int feetAnswer = scanner.nextInt();
            scanner.nextLine();
            System.out.print("What is the inch: ");
            int inchAnswer = scanner.nextInt();
            scanner.nextLine();
            double centimeterConvert = ConvertCentimetersOverload.convertToCentimeters(feetAnswer,inchAnswer);
            System.out.println("Converted centimeter is: " + centimeterConvert);
        }
        else {
            System.out.println("Invalid");
        }
    }
}