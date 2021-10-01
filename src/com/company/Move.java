package com.company;

public class Move {
    private Player player;
    private Tile start;
    private Tile end;
    private Piece pieceMoved;

    public Move(Player player, Tile start, Tile end)  {
        this.player = player;
        this.start = start;
        this.end = end;
        this.pieceMoved = start.getPiece();
    }

    // Checks move before
    public boolean checkMove() {
        if (start.getX() == end.getX() || start.getY() == end.getY()) {

            return false;
        } else if (start.getPiece().getSymbol() == "Kn") {

            return start.getPiece().isValidKnightMove(start.getX(), start.getY(), end.getX(), end.getY());
        } else if (start.getPiece().getSymbol() == "Bi") {

            return start.getPiece().isValidBishopMove(start.getX(), start.getY(), end.getX(), end.getY());
        } else if (start.getPiece().getSymbol() == "Ro") {

            return start.getPiece().isValidRookMove(start.getX(), start.getY(), end.getX(), end.getY());
        } else if (start.getPiece().getSymbol() == "Qu") {

            return start.getPiece().isValidQueenMove(start.getX(), start.getY(), end.getX(), end.getY());
        } else if(start.getPiece().getSymbol() == "Ki") {

            return start.getPiece().isValidKingMove(start.getX(), start.getY(), end.getX(), end.getY());
        } else {
            return false;
        }
    }

    public boolean finalizeMove() {
        System.out.println("Testing");
        if (end.getPiece() != null) {
            if ((start.getPiece().isWhite() && !end.getPiece().isWhite()) || (!start.getPiece().isWhite() && end.getPiece().isWhite())) {
                end.getPiece().setCaptured(true);
                player.setScore(end.getPiece());
                end.setPiece(pieceMoved);
                start.setPiece(null);
                return true;
            } else {
                return false;
            }
        }  else {
            end.setPiece(pieceMoved);
            start.setPiece(null);
            return true;
        }
    }
}
