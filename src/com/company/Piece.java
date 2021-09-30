package com.company;

public class Piece {
    // Variables
    Player owner;
    int pos_x, pos_y;
    int rank;
    String symbol;

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public int getPos_y() {
        return pos_y;
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
    Boolean isMoved;

    public Pawn(int pos_x, int pos_y, Player owner) {
        this.owner = owner;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.rank =  1;
        this.symbol = "Pa";
    }

    public void movePawn(int x1, int y1, int x2, int y2) {
        /*
        if (board[x2, y2].owner != migselv) {
            // angrib skrå er tilladt
        } else if (board[x2, y2] != gameboard.white || board[x2, y2] != gameboard.black) {
            if (isMoved) {
                if (y1 - y2 == 1 && x1 == x2) {
                    this.pos_x = x2;
                    this.pos_y = y2;
                }
            } else {
                if (y1 - y2 <= 2 && x1 == x2) {
                    this.pos_x = x2;
                    this.pos_y = y2;
                    this.isMoved = true;
                }
            }
        } else {
            // invalid move.
        }
         */
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

    public boolean isValid(int x1, int y1, int x2, int y2) {
        if (Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2))== Math.sqrt(5)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean moveKnight(int x1, int y1, int x2, int y2) {
        if (isValid(x1, x2, y1, y2)) {
            this.pos_x = x2;
            this.pos_y = y2;

            return true;
        } else {
            return false;
        }

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
