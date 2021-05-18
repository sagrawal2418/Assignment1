package com.bu.game.donkeypong.characters;

import com.bu.game.donkeypong.Action;

/**
 * @author Sandeep Agrawal
 */
public class Mario extends Character {

    //instance variables
    private boolean ableToClimb;
    private boolean hammerAvailable;
    private boolean dead;

    //Primary constructor calling the handle action method with move right parameter
    public Mario() {
        handleAction(Action.MOVE_RIGHT); //initially when game begins mario moves to right
    }

    //Getters and Setters
    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public boolean isHammerAvailable() {
        return hammerAvailable;
    }

    public void setHammerAvailable(boolean hammerAvailable) {
        this.hammerAvailable = hammerAvailable;
    }

    public boolean isAbleToClimb() {
        return ableToClimb;
    }

    public void setAbleToClimb(boolean ableToClimb) {
        this.ableToClimb = ableToClimb;
    }

    /**
     *
     * @param action1 First action done by Mario
     * @param action2 Second action done by Mario
     * This method handles simultaneous actions performed by Mario
     */
    public void handleAction(String action1, String action2) {

        if (action1.equals(Action.JUMP) && action2.equals(Action.GRAB_HAMMER)) {
            System.out.println("Mario is jumping to grab the hammer");
        } else if (action1.equals(Action.MOVE_RIGHT) && action2.equals(Action.JUMP)) {
            System.out.println("Mario is moving right and jumping");
        }
    }

    /**
     *
     * @param action Action performed by the character
     */
    public void handleAction(String action) {
        switch (action) {
            case Action.MOVE_RIGHT:
                System.out.println("Mario is moving right");
                break;
            case Action.CLIMB:
                System.out.println("Mario is climbing ladder");
                break;
            case Action.JUMP:
                System.out.println("Mario is jumping");
                break;
            case Action.USE_HAMMER:
                System.out.println("Mario is using the hammer");
                break;
            case Action.HIT_BY_BARRELL:
                System.out.println("Mario got hit by barrel");
        }
    }
}
