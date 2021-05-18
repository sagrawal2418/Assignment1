package com.bu.game.donkeypong.characters;

import com.bu.game.donkeypong.Action;

/**
 * @author Sandeep Agrawal
 */
public class Gorilla extends Character {

    //Primary constructor where donkey kong is initially climbing the ladder with the princess
    public Gorilla() {
        System.out.println("Donkey is climbing ladder with princess");
    }

    /**
     *
     * @param action Action performed by the character
     */
    @Override
    public void handleAction(String action) {

        switch (action) {
            case Action.THROW_REGULAR_BARRELL:
                System.out.println("Gorilla throws the regular barrel");
                break;
            case Action.THROW_BLUE_BARRELL:
                System.out.println("Gorilla throws the blue barrel");
                break;
            case Action.MOVE_LEFT:
                System.out.println("Gorilla moving left");
                break;
        }
    }
}
