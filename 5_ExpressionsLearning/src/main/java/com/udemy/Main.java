package com.udemy;

public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println("the highest score is: " + calculateScore(gameOver, score, levelCompleted, bonus));

        score= 10000;
        levelCompleted = 8;
        bonus =200;

        System.out.println("the next highest score is: " + calculateScore(gameOver,score,levelCompleted,bonus));

        System.out.println(isTooYoung(18));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        // void - takes no data in, and returns no data from method.
        // public - It is accessible to the outside because of public
        // static - it can be called directly using the class name


        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;

        // void gives a statement that you cannot print away from this method
        // datatype(int in this case) has return, that lets you print in other methods
    }

    public static boolean isTooYoung(int age){
        boolean result;
        result = age > 21;

        return result;
    }
}