package com.bu.game.donkeypong.characters;

import com.bu.game.donkeypong.Action;

/**
 * @author Sandeep Agrawal
 */
public class Princess extends Character {

    /**
     *
     * @param action Action performed by the character
     */
    @Override
    public void handleAction(String action) {

        if (action.equals(Action.CALL_FOR_HELP)) {
            System.out.println("Princess calling for help");
        }
    }
}
