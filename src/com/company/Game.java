package com.company;

import java.util.Scanner;

public class Game {

    public void startGame() {
        // write your code here
        System.out.println("Welcome to MHFs Awesome Chess");
        Player testPlayer = new Player(true);
        // Create Board and Game functions
        Board gameBoard = new Board();

        // Give Players all the pieces
        gameBoard.white.initializePieces();
        gameBoard.black.initializePieces();

        // Initialize Gameboard with start positions
        gameBoard.initializeBoard();

        // Game loop
        while(gameBoard.isGameOver() == false) {

            System.out.println(gameBoard.board[1][1].getPos_x());
            System.out.println(gameBoard.board[1][1].getPos_y());

            gameBoard.board[1][1].setPos_x(3);
            gameBoard.board[1][1].setPos_y(3);

            gameBoard.board[1][2] = gameBoard.board[1][1];
            gameBoard.board[1][1] = null;


            // Print Current Positions
            gameBoard.printBoard();

            // Display score is each rounded
            gameBoard.getCurrentScore();

            // Check whose turn it is
            if (gameBoard.isWhiteTurn()) {
                // Get User Input
                String turnInstructions = getUserInput(true);
                gameBoard.white.makeMove(turnInstructions);
            } else {
                // Get User Input
                String turnInstructions = getUserInput(false);
                gameBoard.black.makeMove(turnInstructions);
            }
        }
    }

    public String getUserInput(boolean whoseTurn) {
        // Create scanner
        Scanner scanner = new Scanner(System.in);

        if (whoseTurn) {
            System.out.println("\nWhite to play");
        } else {
            System.out.println("\nBlack to play");
        }

        System.out.println("Enter move (piece_x, piece_y, new_x, new_y):");
        String userSelection = scanner.next();

        return userSelection;
    }
}
