package com.codecool.ants;

import com.codecool.ants.geometry.Direction;
import com.codecool.ants.geometry.Position;

public class Worker extends Ant {

    public Worker(Position position, Colony colony) {
        super(position, 'W', colony);
    }

    @Override
    void move() {
//        the workers normally make one step in one of the four
//        directions, chosen randomly before each move
        this.moveIntoDirection(Direction.getRandomDirection());
    }
}