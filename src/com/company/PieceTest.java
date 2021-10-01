package com.company;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    King testKing = new King(true);
    Knight testKnight = new Knight(true);
    Rook testRook = new Rook(true);
    Bishop testBishop = new Bishop(true);
    Pawn testPawn = new Pawn(true);
    Queen testQueen = new Queen(true);

    @org.junit.jupiter.api.Test
    void isValidKnightMove() {
        //2 valid moves: 4,4 -> 2,3 & 5,6 invalid:3,4 & 2,4
        assertTrue(testKnight.isValidKnightMove(4,4,2,3));
        assertTrue(testKnight.isValidKnightMove(4,4,5,6));
        assertTrue(testKnight.isValidKnightMove(1,1,1,1));

        assertFalse(testKnight.isValidKnightMove(4,4,3,4));
        assertFalse(testKnight.isValidKnightMove(4,4,2,4));
        assertFalse(testKnight.isValidKnightMove(4,4,4,4));
    }

    @org.junit.jupiter.api.Test
    void isValidKingMove() {
        //valid: 4,4 -> 3,4 & 3,3 invalid: 2,4 & 2,5
        assertTrue(testKing.isValidKingMove(4,4,3,4));
        assertTrue(testKing.isValidKingMove(4,4,3,3));

        assertFalse(testKing.isValidKingMove(4,4,2,4));
        assertFalse(testKing.isValidKingMove(4,4,2,5));
        assertFalse(testKing.isValidKingMove(4,4,4,4));

    }

    @org.junit.jupiter.api.Test
    void isValidRookMove() {
        //2,1 -> 8,1 & 2,8, invalid: 3,2 & 3,3
        assertTrue(testRook.isValidRookMove(2,1,8,1));
        assertTrue(testRook.isValidRookMove(2,1,2,8));

        assertFalse(testRook.isValidRookMove(2,1,3,2));
        assertFalse(testRook.isValidRookMove(2,1,3,3));

        assertFalse(testRook.isValidRookMove(2,1,2,1));
    }
    @org.junit.jupiter.api.Test
    void isValidBishopMove() {
        //1,1 -> 8,8. 4,4 -> 7,1, invalid: 4,4 -> 1,2 & 1,4
        assertTrue(testBishop.isValidBishopMove(1,1,8,8));
        assertTrue(testBishop.isValidBishopMove(4,4,7,1));
        assertFalse(testBishop.isValidBishopMove(4,4,1,2));
        assertFalse(testBishop.isValidBishopMove(4,4,1,4));
        assertFalse(testBishop.isValidBishopMove(4,4,4,4));
    }
    @org.junit.jupiter.api.Test
    void isValidQueenMove() {
        //4,4 -> 1,4 & 8,8, invalid: 4,4 -> 2,3 & 5,8
        assertTrue(testQueen.isValidQueenMove(4,4,1,4));
        assertTrue(testQueen.isValidQueenMove(4,4,8,8));
        assertFalse(testQueen.isValidQueenMove(4,4,2,3));
        assertFalse(testQueen.isValidQueenMove(4,4,5,8));
        assertFalse(testQueen.isValidQueenMove(4,4,4,4));
    }
}