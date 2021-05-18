package com.bu.game.donkeypong.characters;

/**
 * @author Sandeep Agrawal
 * This class is used as a parent class for all the characters since all perform some actions
 */
public abstract class Character {

    /**
     * @param action Action performed by the character
     */
    public abstract void handleAction(String action);

}
