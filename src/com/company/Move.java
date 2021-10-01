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
        if (start.getX() == end.getX() && start.getY() == end.getY()) {
            System.out.println(1);
            return false;
        } else if (start.getPiece().getSymbol() == "Kn") {
            System.out.println(2);
            return start.getPiece().isValidKnightMove(start.getX(), start.getY(), end.getY(), end.getX());
        } else if (start.getPiece().getSymbol() == "Bi") {
            System.out.println(3);
            return start.getPiece().isValidBishopMove(start.getX(), start.getY(), end.getY(), end.getX());
        } else if (start.getPiece().getSymbol() == "Ro") {
            System.out.println(4);
            return start.getPiece().isValidRookMove(start.getX(), start.getY(), end.getX(), end.getY());
        } else if (start.getPiece().getSymbol() == "Qu") {
            System.out.println(5);
            return start.getPiece().isValidQueenMove(start.getX(), start.getY(), end.getX(), end.getY());
        } else if(start.getPiece().getSymbol() == "Ki") {
            System.out.println(6);
            return start.getPiece().isValidKingMove(start.getX(), start.getY(), end.getX(), end.getY());
        } else {
            System.out.println("Here");
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

    public Tile getStart() {
        return start;
    }

    public Tile getEnd() {
        return end;
    }
}
