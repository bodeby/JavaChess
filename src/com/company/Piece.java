package com.company;

public class Piece {
    // Variables
    Player owner;
    int pos_x, pos_y;
    int rank;

    // Constructor
    public Piece() {

    }

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
    int x_range;
    int y_range;
    Boolean isMoved;

    public Pawn(int pos_x, int pos_y, Player owner, int rank) {
        this.owner = owner;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.rank =  1;
    }

    public void movePawn(int x1, int y1, int x2, int y2) {
        this.pos_x = x2;
        this.pos_y = y2;
    }
}

// Knight Class
class Knight extends Piece {
    int x_range;
    int y_range;

    public Knight(int pos_x, int pos_y, Player owner, int rank) {
        this.owner = owner;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.rank =  3;
    }


    public void moveKnight(int x1, int y1, int x2, int y2) {
        this.pos_x = x2;
        this.pos_y = y2;
    }
}

// Rook Class
class Rook extends Piece {
    int x_range;
    int y_range;
    Boolean isMoved;

    public Rook(int pos_x, int pos_y, Player owner, int rank) {
        this.owner = owner;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.rank =  5;
    }

    public void moveRook(int x1, int y1, int x2, int y2) {
        this.pos_x = x2;
        this.pos_y = y2;
    }
}

// Bishop Class
class Bishop extends Piece {
    int x_range;
    int y_range;

    public Bishop(int pos_x, int pos_y, Player owner, int rank) {
        this.owner = owner;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.rank =  3;
    }

    public void moveBishop(int x1, int y1, int x2, int y2) {
        this.pos_x = x2;
        this.pos_y = y2;
    }
}

// Queen Class
class Queen extends Piece {
    int x_range;
    int y_range;

    public Queen(int pos_x, int pos_y, Player owner, int rank) {
        this.owner = owner;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.rank =  9;
    }

    public void moveQueen(int x1, int y1, int x2, int y2) {
        this.pos_x = x2;
        this.pos_y = y2;
    }
}

// King Class
class King extends Piece {
    int x_range;
    int y_range;
    Boolean isMoved;

    public King(int pos_x, int pos_y, Player owner, int rank) {
        this.owner = owner;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.rank =  10;
    }

    public void moveKing(int x1, int y1, int x2, int y2) {
        this.pos_x = x2;
        this.pos_y = y2;
    }
}
