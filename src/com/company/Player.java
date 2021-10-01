package com.company;

public class Player {
    int score;
    boolean isWhite;

    public Player(boolean isWhite) {
        this.score = 0;
        this.isWhite = isWhite;
    }

    // Getter
    public int getScore() {
        return score;
    }

    // Setter
    public void setScore(Piece caputred) {
        this.score += caputred.rank;
    }
}
