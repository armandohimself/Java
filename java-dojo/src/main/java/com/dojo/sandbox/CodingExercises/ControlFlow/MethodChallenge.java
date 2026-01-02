package com.dojo.sandbox.CodingExercises.ControlFlow;

public class MethodChallenge {
    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        // if (playerScore >= 1000) {
        //     return 1;
        // } else if (playerScore >= 500 && playerScore < 1000) {
        //     return 2;
        // } else if (playerScore >= 100 && playerScore < 500) {
        //     return 3;
        // } else {
        //     return 4;
        // }

        // When asked by course how we can think about improving the code above

        if (playerScore < 100) {
            return 4;
        } else if (playerScore < 500) {
            return 3;
        } else if (playerScore < 1000) {
            return 2;
        } else {
            return 1;
        }

        // Alternative is that we could have also used a variable to return

        // int position = 4;
        // if (playerScore >= 1000) {
        //     position = 1;
        // } else if (playerScore >= 500) {
        //     position = 2;
        // } else if (playerScore >= 100) {
        //     position = 3;
        // }

        // return position;

        //? Context: The course just said that you may want to return directly or from a variable depending on the case. My question was what are those cases. 
        // ChatGPT says that you return directly when the logic is simple and use a variable for more complex logic like when needing to compare high scores.
        // Going to keep this in mind for future projects. 

    }

    public static void main(String[] args) {
        
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", position);
        
        position = calculateHighScorePosition(999);
        displayHighScorePosition("Tim", position);
        
        position = calculateHighScorePosition(499);
        displayHighScorePosition("Tim", position);
        
        position = calculateHighScorePosition(99);
        displayHighScorePosition("Tim", position);
        
        position = calculateHighScorePosition(-1000);
        displayHighScorePosition("Tim", position);

    }
}