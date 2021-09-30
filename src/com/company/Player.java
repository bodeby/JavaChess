package com.company;

public class Player {
    int score;
    boolean isWhite;

    // Piece Arrays
    Piece[] pawns;
    Piece[] knights;
    Piece[] bishops;
    Piece[] rooks;
    Piece[] queen;
    Piece[] king;

    public Player(boolean isWhite) {
        this.score = 0;
        this.isWhite = isWhite;

        // Pieces
        this.pawns = new Piece[8];
        this.knights = new Piece[2];
        this.bishops = new Piece[2];
        this.rooks = new Piece[2];
        this.queen = new Piece[1];
        this.king = new Piece[1];
    }

    public void initializePieces() {
        for (int i = 0; i <= 7; i++ ) {
            this.pawns[i] = new Pawn(0,0, this);
        }

        // Initialize Knights
        this.knights[0] = new Knight(0,0,this);
        this.knights[1] = new Knight(0,0, this);

        // Initialize Rooks
        this.rooks[0] = new Rook(0,0, this);
        this.rooks[1] = new Rook(0,0, this);

        // Initialize Bishops
        this.bishops[0] = new Bishop(0,0,this);
        this.bishops[1] = new Bishop(0,0,this);

        // Initialize Queen
        this.queen[0] = new Queen(0,0,this);

        // Initialize King
        this.king[0] = new King(0,0,this);

    }

    public void makeMove(String turnInstructions) {

        System.out.println(turnInstructions);


    }

    // Getter
    public int getScore() {
        return score;
    }

    // Setter
    public void setScore(int score) {
        this.score = 0;
    }
}
