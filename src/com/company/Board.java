package com.company;

public class Board {
    public Tile[][] tiles;

    public Board() {
        this.initializeBoard();
    }

    public void initializeBoard() {
        tiles = new Tile[8][8];

        for (int i = 0; i <= 7; i++) {
            tiles[i][1] = new Tile(new Pawn(false), i, 1);
            tiles[i][6] = new Tile(new Pawn(true), i, 6);
        }

        // Initialize White Knights
        tiles[1][7] = new Tile(new Knight(true), 1, 7);
        tiles[6][7] = new Tile(new Knight(true), 6, 7);

        // Initialize Black Knights
        tiles[1][0] = new Tile(new Knight(false), 1, 0);
        tiles[6][0] = new Tile(new Knight(false), 6, 0);

        // Initialize White Bishops
        tiles[2][7] = new Tile(new Bishop(true), 2, 7);
        tiles[5][7] = new Tile(new Bishop(true), 5, 7);

        // Initialize Black Bishops
        tiles[2][0] = new Tile(new Bishop(false), 2, 0);
        tiles[5][0] = new Tile(new Bishop(false), 5, 0);

        // Initialize White Rooks
        tiles[0][7] = new Tile(new Rook(true), 0, 7);
        tiles[7][7] = new Tile(new Rook(true), 7,7);

        // Initialize Black Rooks
        tiles[0][0] = new Tile(new Rook(false), 0, 0);
        tiles[7][0] = new Tile(new Rook(false), 7, 0);

        // Initialize Queens
        tiles[3][7] = new Tile(new Queen(true), 3, 7);
        tiles[3][0] = new Tile(new Queen(false), 3, 0);

        // Initialize Kings
        tiles[4][7] = new Tile(new King(true), 4, 7);
        tiles[4][0] = new Tile(new King(false), 4, 0);

        // Initialize Empty Tiles
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                tiles[j][i] = new Tile(null, i, j);
            }
        }
    }
    public Tile getTile(int x, int y) {
        return tiles[x][y];
    }

    // Formatted output of board
    // Andres Please dont look here. ugly code alert
    public void printBoard() {
        System.out.print("     ");
        for(int i = 0; i <= 7; i++){
            System.out.print("|"+(i)+"| ");
        }
        System.out.println("\n");
        for (int i = 0; i <= 7; i++) {
            System.out.print("|"+(i)+"|  ");

            for (int j = 0; j <= 7; j++) {
                if (tiles[j][i].getPiece() != null) {

                    if (tiles[j][i].getPiece().isWhite()) {
                        System.out.print("["+ tiles[j][i].getPiece().getSymbol() + "]");
                    } else {
                        System.out.print(" "+ tiles[j][i].getPiece().getSymbol() + " ");
                    }
                } else {
                    System.out.print(" -  ");
                }
            }
            System.out.print("\n");
        }
    }

}
