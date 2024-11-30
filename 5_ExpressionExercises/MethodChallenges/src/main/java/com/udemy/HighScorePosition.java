package com.udemy;

/*
In this challenge we're going to create two methods:
The first method should be named displayHighScorePosition.
This method should have two parameters, one for a player's name, and one for a player's position in a high score list.
This method should print a message like "Tim managed to get into position 2 on the high score list

The second method should be named calculateHighScorePosition.
This method should have only one parameter, the player's score.
This method should return a number between 1 and 4, based on the score values shown in this table.

Finally, we'll call both methods and display the results for the following scores: 1500, 1000, 500, 100, and 25.
 */



public class HighScorePosition {
    public static void displayHighScorePosition(String playerName, int playerPosition){

        System.out.println(playerName + " managed to get into position "
                + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore){
        int result;
        if (playerScore >= 1000){
            result = 1;
        }
        else if (playerScore >= 500){
            result = 2;
        }
        else if (playerScore >= 100) {
            result = 3;
        }
        else {
            result = 4;
        }

        return result;
    }

}
