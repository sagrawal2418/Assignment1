package com.bu.game.donkeypong;

import com.bu.game.donkeypong.characters.Gorilla;
import com.bu.game.donkeypong.characters.Mario;
import com.bu.game.donkeypong.characters.Princess;

/**
 * @author Sandeep Agrawal
 * This project is a simulation of the Donkey kong game
 * This clsss is used to simulate the Donkey Kong game
 */
public class GameRunner {


    /**
     * @param args this contains the java command line arguments
     * @return Does not return anything
     * @description This method is the main method and is used to execute other
     * methods in this file
     */
    public static void main(String[] args) {

        System.out.println("Game Starts");
        Gorilla gorilla = new Gorilla(); //create gorilla instance and execute the primary constructor
        gorilla.handleAction(Action.THROW_BLUE_BARRELL); //gorilla will start throwing the blue barrel
        System.out.println("Light up fireball "); //blue barrel will light up the fireball
        gorilla.handleAction(Action.THROW_REGULAR_BARRELL); //gorilla will throw the regular barrel
        Points points = new Points("Level 1", 0, 12500, 5000); //create points object and call the parameterized constructor
        Mario mario = new Mario(); //create mario object and execute the primary constructor
        Princess princess = new Princess(); //create princess object
        mario.handleAction(Action.MOVE_RIGHT, Action.JUMP); //Mario will move right and jump
        points.setScore(1000); //set points after mario action
        mario.setAbleToClimb(true); //make ladder available to climb
        gorilla.handleAction(Action.THROW_REGULAR_BARRELL); //gorilla will throw regular barrel
        if (mario.isAbleToClimb()) { //check if mario is able to climb the ladder
            mario.handleAction(Action.CLIMB); //if able to climb handle climb action
        }
        points.setScore(2000); //set the point for the climb
        mario.setHammerAvailable(true); //make hammer available to grab
        if (mario.isHammerAvailable()) { //check if hammer is available to grab
            mario.handleAction(Action.JUMP, Action.GRAB_HAMMER); //set action to jump and grab the hammer
        }
        points.setScore(1000); //set the point for grabbing the hammer
        gorilla.handleAction(Action.THROW_BLUE_BARRELL); //gorilla throws the blue barrel
        princess.handleAction(Action.CALL_FOR_HELP); //princess calls for help
        mario.handleAction(Action.USE_HAMMER); //mario uses his hammer to break the barrels
        points.setScore(3000); //mario gets points for breaking the barrel
        mario.handleAction(Action.JUMP); //mario jumps over the barrel
        mario.setAbleToClimb(true);
        if (mario.isAbleToClimb()) {
            mario.handleAction(Action.CLIMB); //mario climbs a ladder
        }
        mario.handleAction(Action.HIT_BY_BARRELL); //mario gets hit by barrel
        mario.setDead(true); //mario dies
        if (mario.isDead()) { //check if mario is dead
            System.out.println("Game over"); // game is over
            System.out.println("Final score: " + points.getScore()); //final score after game
        }

    }

}
