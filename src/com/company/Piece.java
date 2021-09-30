package com.company;

public class Piece {
    // Variables
    Player owner;
    int pos_x, pos_y;
    int rank;
    String symbol;
}

/*
* All Specific Pieces
* - Pawn Class
* - Knight Class
* - Rook Class
* - Bishop Class
* - Queen Class
* - King Class
 */

// Pawn Class
class Pawn extends Piece {
    Boolean isMoved;

    public Pawn(int pos_x, int pos_y, Player owner) {
        this.owner = owner;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.rank =  1;
        this.symbol = "Pa";
    }

    public void movePawn(int x1, int y1, int x2, int y2) {
        this.pos_x = x2;
        this.pos_y = y2;

        if (isMoved) {

        }
    }
}

// Knight Class
class Knight extends Piece {
    public Knight(int pos_x, int pos_y, Player owner) {
        this.owner = owner;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.rank =  3;
        this.symbol = "Kn";
    }


    public void moveKnight(int x1, int y1, int x2, int y2) {
        this.pos_x = x2;
        this.pos_y = y2;
    }
}

// Rook Class
class Rook extends Piece {
    public Rook(int pos_x, int pos_y, Player owner) {
        this.owner = owner;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.rank =  5;
        this.symbol = "Ro";
    }

    public void moveRook(int x1, int y1, int x2, int y2) {
        this.pos_x = x2;
        this.pos_y = y2;
    }


}

// Bishop Class
class Bishop extends Piece {
    public Bishop(int pos_x, int pos_y, Player owner) {
        this.owner = owner;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.rank =  3;
        this.symbol = "Bi";
    }

    public void moveBishop(int x1, int y1, int x2, int y2) {
        this.pos_x = x2;
        this.pos_y = y2;
    }
}

// Queen Class
class Queen extends Piece {
    public Queen(int pos_x, int pos_y, Player owner) {
        this.owner = owner;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.rank =  9;
        this.symbol = "Qu";
    }

    public void moveQueen(int x1, int y1, int x2, int y2) {
        this.pos_x = x2;
        this.pos_y = y2;
    }
}

// King Class
class King extends Piece {
    Boolean isMoved;
    Boolean isChecked;

    public King(int pos_x, int pos_y, Player owner) {
        this.owner = owner;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.rank =  10;
        this.symbol = "Ki";
    }

    public void moveKing(int x1, int y1, int x2, int y2) {
        this.pos_x = x2;
        this.pos_y = y2;
    }
}
