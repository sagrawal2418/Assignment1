package com.bu.game.donkeypong;

/**
 * @author Sandeep Agrawal
 */
public class Points {

    //instance variables
    private String level;
    private int score;
    private int highestScore;
    private int bonusScore;

    /**
     *
     * @param level - Game levels
     * @param score - Player score initially
     * @param highestScore - Current highest score in the game
     * @param bonusScore - Bonus score for some actions
     */
    public Points(String level, int score, int highestScore, int bonusScore) {
        this.level = level;
        this.score = score;
        this.highestScore = highestScore;
        this.bonusScore = bonusScore;
    }

    //Getters and Setters
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }


    public void setScore(int score) {
        this.score = this.score + score; //updating the score variable as mario get points
    }

    public int getHighestScore() {
        return highestScore;
    }

    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }

    public int getBonusScore() {
        return bonusScore;
    }

    public void setBonusScore(int bonusScore) {
        this.bonusScore = bonusScore;
    }

    /**
     *
     * @return Print the content of the points object
     */
    @Override
    public String toString() {
        return "Points{" +
                "level='" + level + '\'' +
                ", score=" + score +
                ", highestScore=" + highestScore +
                ", bonusScore=" + bonusScore +
                '}';
    }
}
