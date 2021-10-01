package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.*;

public class Game {
    private Board board;
    public Player white;
    public Player black;

    // State Management Variables
    private int currentTurn;
    private int status;

    public void startGame() {

        // Set Turn and Status for game
        this.setCurrentTurn(1);
        this.setStatus(0);

        // Create Board and Game functions
        Board gameBoard = new Board();

        // Give Players all the pieces
        gameBoard.initializeBoard();

        // Create Players
        white = new Player(true);
        black = new Player(true);

        // write your code here
        System.out.println("Welcome to MHFs Awesome Chess");

        // Game loop
        while(this.isGameOver() == false) {

            // Print Current Positions
            gameBoard.printBoard();

            // Display score is each rounded
            this.getCurrentScore();

            // Check whose turn it is
            if (this.isWhiteTurn()) {
                // Get User Input
                char[] turnInstructions = getUserInput(true);
                //gameBoard.white.makeMove(turnInstructions);
                int x1 = turnInstructions[0];
                int y1 = turnInstructions[2];
                int x2 = turnInstructions[4];
                int y2 = turnInstructions[6];

                Move turnMove = new Move(this.white, gameBoard.getTile(x1,y1), gameBoard.getTile(x2, y2));

                if (turnMove.checkMove()) {
                    if (turnMove.finalizeMove()) {
                        this.currentTurn++;
                    }
                } else {
                    System.out.println("Invalid move");
                }
            } else {
                // Get User Input
                char[] turnInstructions = getUserInput(false);
                //gameBoard.black.makeMove(turnInstructions);

                int x1 = Character.getNumericValue(turnInstructions[0]);
                int y1 = Character.getNumericValue(turnInstructions[2]);
                int x2 = Character.getNumericValue(turnInstructions[4]);
                int y2 = Character.getNumericValue(turnInstructions[6]);

                for (int i = 0; i < turnInstructions.length; i++) {
                    System.out.println(turnInstructions[i]);
                }

                Move turnMove = new Move(this.black, gameBoard.getTile(x1,y1), gameBoard.getTile(x2, y2));

                if (turnMove.checkMove()) {
                    if (turnMove.finalizeMove()) {
                        this.currentTurn++;
                    }
                } else {
                    System.out.println("Invalid move");
                }
            }
        }
    }

    // Getter Turn
    public int getCurrentTurn() {
        return currentTurn;
    }

    // Setter Turn
    public void setCurrentTurn(int currentTurn) {
        this.currentTurn = currentTurn;
    }

    // Getter Status
    public int getStatus() {
        return status;
    }

    // Setter Status
    public void setStatus(int status) {
        this.status = status;
    }

    // Check if White has the turn
    public boolean isWhiteTurn() {
        if (this.getCurrentTurn() % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    // Function for getting user input from Scanner
    public char[] getUserInput(boolean whoseTurn) {
        if (whoseTurn) {
            System.out.println("\nWhite to play");
        } else {
            System.out.println("\nBlack to play");
        }

        System.out.println("Enter move (piece_x, piece_y, new_x, new_y):");

            // Create scanner
            Scanner scanner = new Scanner(System.in).useDelimiter("\n");
            String regex = "[0-8]+\\s+[0-8]+\\s+[0-8]\\s+[0-8]";
            String userSelection = scanner.next();

            if (Pattern.matches(regex, userSelection)) {
                char[] moveSet = userSelection.toCharArray();
                return moveSet;
            } else {
                char[] moveSet = userSelection.toCharArray();
                System.out.println(moveSet);
                return "Could not read input".toCharArray();
            }
    }

    // Check if White has lost the king
    public boolean isWhiteWinner() {
        if (this.black == null) {
            return true;
        }
        return false;
    }

    // Check if Black has lost the king
    public boolean isBlackWinner() {
        if (this.white == null) {
            return true;
        }
        return false;
    }

    //checks to see if either black or white has won
    public boolean isGameOver(){
        if(isWhiteWinner() || isBlackWinner()){
            return true;
        }
        else{
            return false;
        }
    }

    //Get current score
    public void getCurrentScore(){
        // Calculate Winning Score
        int winningScore = Math.abs(this.white.getScore()-this.black.getScore());

        // Return wether White or black is winning.
        if (this.white.getScore() > this.black.getScore()) {
            System.out.println("White is currently winning with "+  winningScore +" points");
        } else if (this.black.getScore() > this.white.getScore()) {
            System.out.println("Black is currently winning with "+ winningScore+" points");
        } else{
            System.out.println("The score is currently tied");
        }
    }
}
