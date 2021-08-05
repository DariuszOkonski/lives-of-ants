package com.codecool.ants;

import com.codecool.ants.geometry.Direction;
import com.codecool.ants.geometry.Position;

public class Soldier extends Ant {
    private Direction lastStepDirection;

    public Soldier(Position position, Colony colony) {
        super(position, 'S', colony);
        this.lastStepDirection = Direction.getRandomDirection();
    }

    @Override
    void move() {
//        the soldiers "patrol" close to their starting position;
//        this means that in a 4-cycle they step one and turn to the left
//        (towards North, East, South, and West, and then they start the cycle again)

//        Direction newDirection = lastStepDirection.turnLeft();
//        lastStepDirection = newDirection;
//        moveIntoDirection(newDirection);
//        System.out.println("Soldier moves");
    }
}


