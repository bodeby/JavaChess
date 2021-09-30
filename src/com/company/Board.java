package com.company;

public class Board {
    int turn;
    Player black;
    Player white;
    Piece[][] board;

    // Board Constructor
    public Board() {
        this.turn = 0;
        this.white = new Player(true);
        this.black = new Player(false);
        this.board = new Piece[8][8];
    }

    // Create all pieces for the board
    public void initializeBoard() {
        // Initialize pawns
        for (int i = 0; i <= 7; i++) {
            board[i][1] = this.black.pawns[i];
            board[i][6] = this.white.pawns[i];
        }

        // Initialize White Knights
        board[1][7] = this.white.knights[0];
        board[6][7] = this.white.knights[1];

        // Initialize Black Knights
        board[1][0] = this.black.knights[0];
        board[6][0] = this.black.knights[1];

        // Initialize white Rooks
        board[0][7] = this.white.rooks[0];
        board[7][7] = this.white.rooks[1];

        // Initialize black Rooks
        board[0][0] = this.black.rooks[0];
        board[7][0] = this.black.rooks[1];

        // Initialize white Bishops
        board[2][7] = this.white.bishops[0];
        board[5][7] = this.white.bishops[1];

        // Initialize black Bishops
        board[2][0] = this.black.bishops[0];
        board[5][0] = this.black.bishops[1];

        // Initialize Queens
        board[3][7] = this.white.queen[0];
        board[3][0] = this.black.queen[0];

        // Initialize King
        board[4][7] = this.white.king[0];
        board[4][0] = this.black.king[0];
    }

    // Formatted output of board
    // Andres Please dont look here. ugly code alert
    public void printBoard() {
        System.out.print("     ");
        for(int i = 0; i <= 7; i++){
            System.out.print("|"+(i+1)+"| ");
        }
        System.out.println("\n");
        for (int i = 0; i <= 7; i++) {
            System.out.print("|"+(i+1)+"|  ");
            for (int j = 0; j <= 7; j++) {
                if (board[j][i] != null) {
                    if (board[j][i].owner.isWhite) {
                        System.out.print("["+ board[j][i].symbol + "]");
                    } else {
                        System.out.print(" "+ board[j][i].symbol + " ");
                    }

                } else {
                    System.out.print(" -  ");
                }
            }
            System.out.print("\n");
        }
    }

    // Check if White has lost the king
    public boolean isWhiteWinner() {
        if (this.black.king == null) {
            return true;
        }
        return false;
    }

    // Check if Black has lost the king
    public boolean isBlackWinner() {
        if (this.white.king == null) {
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

    // Take turn
    public boolean isWhiteTurn() {
        this.turn++;
        if (this.turn%2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    //Get current score
    public void getCurrentScore(){
        // Calculate Winning Score
        int winningScore = Math.abs(this.black.getScore()-this.white.getScore());

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



