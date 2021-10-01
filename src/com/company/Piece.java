package com.company;

public class Piece {
    // Variables
    private boolean isWhite = false;
    private boolean isCaptured = false;

    // For subclasses
    int rank;
    String symbol;

    public Piece(boolean isWhite) {
        this.setWhite(isWhite);
    }

    public void setWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }


    public boolean isCaptured() {
        return isCaptured;
    }

    public void setCaptured(boolean captured) {
        isCaptured = captured;
    }


    // Checks
    public boolean isValidKnightMove(int x1, int y1, int x2, int y2){
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);
        System.out.println(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        if( Math.pow((x1-x2),2)+Math.pow((y1-y2),2) == 5){
            return true;
        } else {
            return false;
        }
    }

    public boolean isValidKingMove(int x1, int y1, int x2, int y2){

        if(Math.sqrt( Math.pow((x1-x2),2)+Math.pow((y1-y2),2) ) <= Math.sqrt(2)){
            return true;
        }
        else{return false;}
    }

    public boolean isValidRookMove(int x1, int y1, int x2, int y2){
        int scenario = 1;
        switch(scenario){
            case 1:
                for(int i = x1;i <= 8; i++){
                    if((i == x2)&&(y1==y2)){return true;}
                }
            case 2:
                for(int i = x1;i >= 1; i--){
                    if((i == x2)&&(y1==y2)){return true;}
                }
            case 3:
                for(int i = y1;i <= 8; i++){
                    if((i == y2)&&(x1==x2)){return true;}
                }
            case 4:
                for(int i = y1;i >= 1; i--){
                    if((i == y2)&&(x1==x2)){return true;}
                }
        }
        return false;
    }

    public boolean isValidBishopMove(int x1, int y1, int x2, int y2){
        if((x1 == x2) && (y1 == y2)){return false;}
        int scenario = 1;
        int x,y;
        switch(scenario){
            case 1:
                x = x1;
                y = y1;
                    while((x<=8) && (x>=1) && (y<=8) && (y>=1)){
                        x++;
                        y++;
                        if((x == x2)&&(y == y2)){
                            return true;
                        }
                    }
            case 2:
                x = x1;
                y = y1;
                while((x<=8) && (x>=1) && (y<=8) && (y>=1)){
                    x--;
                    y--;
                    if((x == x2)&&(y == y2)){
                        return true;
                    }
                }
            case 3:
                x = x1;
                y = y1;
                while((x<=8) && (x>=1) && (y<=8) && (y>=1)){
                    x++;
                    y--;
                    if((x == x2)&&(y == y2)){
                        return true;
                    }
                }
            case 4:
                x = x1;
                y = y1;
                while((x<=8) && (x>=1) && (y<=8) && (y>=1)){
                    x--;
                    y++;
                    if((x == x2)&&(y == y2)){
                        return true;
                    }
                }
        }
        return false;
    }

    public boolean isValidQueenMove(int x1, int y1, int x2, int y2){
        if((x1 == x2) && (y1 == y2)){return false;}
        if(isValidBishopMove(x1,y1,x2,y2) || isValidRookMove(x1,y1,x2,y2)){
            return true;
        }else{return false;}
    }


    public boolean isWhite() {
        return isWhite;
    }

    public String getSymbol() {
        return symbol;
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
    boolean isMoved;

    public Pawn(boolean isWhite) {
        super(isWhite);
        this.rank =  1;
        this.symbol = "Pa";
    }
}

// Knight Class
class Knight extends Piece {

    public Knight(boolean isWhite) {
        super(isWhite);
        this.rank = 3;
        this.symbol = "Kn";
    }
}

// Bishop class
class Bishop extends Piece  {

    public Bishop(boolean isWhite) {
        super(isWhite);
        this.rank = 3;
        this.symbol = "Bi";
    }
}

// Rook Class
class Rook extends Piece {

    public Rook(boolean isWhite) {
        super(isWhite);
        this.rank = 5;
        this.symbol = "Ro";
    }
}

// Queen Class
class Queen extends Piece {

    public Queen(boolean isWhite) {
        super(isWhite);
        this.rank = 9;
        this.symbol = "Qu";
    }
}

// King Class
class King extends Piece {

    public King(boolean isWhite) {
        super(isWhite);
        this.rank = 10;
        this.symbol = "Ki";
    }
}
