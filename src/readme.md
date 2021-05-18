# Donkey Kong Game Simulator
Developed by Sandeep Agrawal

This project simulates a Donkey Kong using OOPs concepts such as Inheritance, Abstraction, Encapsulation and Polymorphism.  

## Technical Details

Technology used - Java

Abstract class - Character.java

Child class - 

Pojo class - Points.java
Constants - Action.java

Main method - GameRunner.java

1. Parent class - Abstract class
2. Child class
      1. Mario.java
      2. Princess.java
      3. Gorilla.java
 3. Abstract method - The method accept Action as an argument which is passed for all the character for the type of action they want to perform at a 
given time. All three characters provide their own implementation on how to handle actions on their respective classes. 
4. Overloaded method - I have created one overloaded method inside Mario class to handle multiple actions at a given time. 
5. Points.java - Created class to set the points and get final score.  

## Assumptions
1. For the purpose of the assignment no UI was implemented. 
2. I have printed statements for various stages in the game as per actions. 
3. All data are hardcoded and does not reflect any realtime simulation. 
4. Game steps
    1. Game starts 
    2. Gorilla throws blue barrel.
    3. Blue barrel lights up fireball. 
    4. Gorilla throws a regular barrel.
    5. Mario moves right and jump over the barrel.
    6. Mario climbs the ladder.
    7. Gorilla throws a regular barrel. 
    8. Mario grabs the hammer 
    9. Gorilla throws blue barrel. 
    10. Princess calls for help.
    11. Mario uses hammer to break the barrells. 
    12. Mario climbs the ladder. 
    13. Mario gets hit by the barrel. 
    14. Mario dies. 
    15. Final score is revealed. 